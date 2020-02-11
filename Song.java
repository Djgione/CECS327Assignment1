//gson model for a song object

public class Song {
	Release release;
	Artist artist;
	SongInfo song;
	
	public class Release{
		public int id;
		public String name;
	}
	public class Artist{
		public double terms_freq;
		public String terms;
		public String name;
		public double familiarity;
		public double longitude;
		public String id;
		public String location;
		public double latitude;
		public String similar;
		public double hotttnesss;
	}
	public class SongInfo{
		public double key;
		public double mode_confidence;
		public double artist_mbtags_count;
		public double key_confidence;
		public double tatums_start;
		public int year;
		public double duration;
		public double hotttnesss;
		public double beats_start;
		public double time_signature_confidence;
		public String title;
		public double bars_confidence;
		public String id;
		public double bars_start;
		public String artist_mbtags;
		public double start_of_fade_out;
		public double tempo;
		public double end_of_fade_in;
		public double beats_confidence;
		public double tatums_confidence;
		public int mode;
		public double time_signature;
		public double loudness;
	}
}
