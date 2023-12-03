package org.videolan.libvlc.util;

import java.util.Arrays;
import java.util.HashSet;

public class Extensions {

    public final static HashSet<String> VIDEO = new HashSet<String>();
    public final static HashSet<String> AUDIO = new HashSet<String>();
    public final static HashSet<String> SUBTITLES = new HashSet<String>();
    public final static HashSet<String> PLAYLIST = new HashSet<String>();


    static {
        final String[] videoExtensions = {".mp4"};

        final String[] audioExtensions = null;

        final String[] subtitlesExtensions = {
                ".idx", ".sub", ".srt", ".ssa", ".ass", ".smi", ".utf", ".utf8", ".utf-8",
                ".rt", ".aqt", ".txt", ".usf", ".jss", ".cdg", ".psb", ".mpsub", ".mpl2",
                ".pjs", ".dks", ".stl", ".vtt", ".ttml"};

        final String[] playlistExtensions = {".m3u", ".asx", ".b4s", ".pls", ".xspf"/*,  ".zip"*/};

        VIDEO.addAll(Arrays.asList(videoExtensions));
        AUDIO.addAll(Arrays.asList(audioExtensions));
        SUBTITLES.addAll(Arrays.asList(subtitlesExtensions));
        PLAYLIST.addAll(Arrays.asList(playlistExtensions));
    }
}
