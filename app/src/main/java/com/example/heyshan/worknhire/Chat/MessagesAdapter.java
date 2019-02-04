package com.example.heyshan.worknhire.Chat;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.heyshan.worknhire.R;

import java.util.List;

public class MessagesAdapter  extends RecyclerView.Adapter<MessagesAdapter.ViewHolder>{

    private List<MessageItem> messageItems;
    private Context context;
    private String currentUserName;
    private String currentUserId;
    private String receiverName;

    public MessagesAdapter(List<MessageItem> messageItems, Context context, String receiverName) {
        this.messageItems = messageItems;
        this.context = context;
        this.receiverName = receiverName;
        SharedPreferences sharedPref = context.getSharedPreferences(
                "spName", Context.MODE_PRIVATE);
        currentUserId = sharedPref.getString("id", "");
        currentUserName = sharedPref.getString("senderName", "");
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.message_layout,parent,false);
        return new MessagesAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final MessageItem messageItem = messageItems.get(position);

        holder.message.setText(messageItem.getBody());
        if(messageItem.getSentBy().equals(currentUserId)){
            holder.name.setText(currentUserName);
            holder.linearLayout.setGravity(Gravity.RIGHT);
            holder.name.setGravity(Gravity.RIGHT);
            holder.message.setGravity(Gravity.RIGHT);
            holder.linearLayoutMessageItem.setBackgroundColor(Color.parseColor("#72a6f9"));
            holder.cardViewMessage.setBackgroundColor(Color.parseColor("#72a6f9"));
            holder.cardViewMessage.setRadius(100);
        }else{
            holder.name.setText(receiverName);
            holder.linearLayout.setGravity(Gravity.LEFT);
            holder.linearLayoutMessageItem.setBackgroundColor(Color.parseColor("#ffffff"));
            holder.cardViewMessage.setBackgroundColor(Color.parseColor("#ffffff"));
            holder.cardViewMessage.setRadius(100);
        }

    }

    @Override
    public int getItemCount() {
        return messageItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name, message, from;
        CardView cardViewMessage;
        LinearLayout linearLayout, linearLayoutMessageItem;
        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.tvName);
            message = (TextView)itemView.findViewById(R.id.tvMessage);
            from = (TextView)itemView.findViewById(R.id.tvFrom);
            cardViewMessage = (CardView)itemView.findViewById(R.id.cardViewMessage);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayoutCardView);
            linearLayoutMessageItem = (LinearLayout) itemView.findViewById(R.id.linearLayoutMessageItem);

        }
    }
}
