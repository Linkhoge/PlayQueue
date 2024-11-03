package Application;

    public class Track 
    {
        private String songName;
        private String artist;
    
        // Constructor
        public Track(String songName, String artist) 
        {
            this.songName = songName;
            this.artist = artist;
        }
    
        // Getters and setters

        // get song name
        public String getSongName() 
        {
            return songName;
        }

        // set song name
        public void setSongName(String songName) 
        {
            this.songName = songName;
        }

        // get artist
        public String getArtist() 
        {
            return artist;
        }
    
        // set artist
        public void setArtist(String artist) 
        {
            this.artist = artist;
        }
    }
