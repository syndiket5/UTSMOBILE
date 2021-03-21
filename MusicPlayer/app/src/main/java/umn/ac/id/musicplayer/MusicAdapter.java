package umn.ac.id.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.SongViewHolder>{

    private Context mContext;
    private ArrayList<MusicFiles> mFiles;

    MusicAdapter(Context mContext, ArrayList<MusicFiles> mFiles){
        this.mFiles = mFiles;
        this.mContext = mContext;
    }
    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.music_list, parent, false);
        return new SongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        holder.music_name.setText(mFiles.get(position).getSongtitle());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent (mContext,PlayerActivity.class);
                intent.putExtra("position", position);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mFiles.size();
    }

    public class SongViewHolder extends RecyclerView.ViewHolder{
        TextView music_name;
        ImageView music_image;

        public SongViewHolder(@NonNull View itemView) {
            super(itemView);
            music_name = itemView.findViewById(R.id.music_name);
            music_image = itemView.findViewById(R.id.music_image);
        }
    }

}
