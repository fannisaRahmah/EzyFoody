//package com.example.utsmoprog;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.GridLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;
//
//public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
//    public static final int SPAN_COUNT_ONE = 1;
//    public static final int SPAN_COUNT_THREE = 3;
//
//    private static final int VIEW_TYPE_SMALL = 1;
//    private static final int VIEW_TYPE_BIG = 2;
//
//    private List<Item> mItems;
//    private GridLayoutManager mLayoutManager;
//
//    public ItemAdapter(List<Item> items, GridLayoutManager layoutManager){
//        mItems = items;
//        mLayoutManager = layoutManager;
//    }
//
//    public int getItemViewType(int position){
//        int spanCount = mLayoutManager.getSpanCount();
//        if(spanCount ==  SPAN_COUNT_ONE){
//            return VIEW_TYPE_BIG;
//        }else {
//            return VIEW_TYPE_SMALL;
//        }
//    }
//
//    @Override
//    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view;
//        if(viewType == VIEW_TYPE_BIG){
//            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_big, parent, false);
//        }else{
//            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_small, parent, false);
//        }
//        return new ItemViewHolder(view, viewType);
//    }
//
//    public void onBindViewHolder(ItemViewHolder holder, int position) {
//        Item item = mItems.get(position % 4);
//        holder.title.setText(item.getTitle());
//        holder.iv.setImageResource(Item.getImgResId());
//        if(getItemViewType(position) == VIEW_TYPE_BIG){
//            holder.info.setText(item.getLikes() + "");
//        }else{
//
//        }
//    }
//
//    public int getItemCount(){
//        return 30;
//    }
//
//    class ItemViewHolder extends RecyclerView.ViewHolder{
//        ImageView iv;
//        TextView title;
//        TextView info;
//
//        ItemViewHolder(View itemView, int viewType){
//            super(itemView);
//            if (viewType == VIEW_TYPE_BIG){
//                iv = (ImageView) itemView.findViewById(R.id.image_big);
//                title = (ImageView) itemView.findViewById(R.id.title_big);
//                info = (TextView) itemView.findViewById(R.id.tv_info);
//            }else{
//                iv = (ImageView) itemView.findViewById(R.id.image_small);
//                title = (TextView) itemView.findViewById(R.id.title_small);
//            }
//        }
//    }
//}
