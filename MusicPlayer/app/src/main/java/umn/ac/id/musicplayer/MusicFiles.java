package umn.ac.id.musicplayer;

public class MusicFiles {
    private String songpath;
    private String songtitle;
    private String songartist;
    private String songalbum;
    private String duration;

    public MusicFiles(String songpath, String songtitle, String songartist, String songalbum, String duration) {
        this.songpath = songpath;
        this.songtitle = songtitle;
        this.songartist = songartist;
        this.songalbum = songalbum;
        this.duration = duration;
    }

    public MusicFiles() {
    }

    public String getSongpath() {
        return songpath;
    }

    public void setSongpath(String songpath) {
        this.songpath = songpath;
    }

    public String getSongtitle() {
        return songtitle;
    }

    public void setSongtitle(String songtitle) {
        this.songtitle = songtitle;
    }

    public String getSongartist() {
        return songartist;
    }

    public void setSongartist(String songartist) {
        this.songartist = songartist;
    }

    public String getSongalbum() {
        return songalbum;
    }

    public void setSongalbum(String songalbum) {
        this.songalbum = songalbum;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
