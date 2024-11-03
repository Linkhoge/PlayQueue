// Student Name     : Ariel Fajimiyo
// Student Id Number: C00300811@setu.ie
// Date             : 31/10/24
// Purpose          : A test driver program for our play queue application
// https://blackboard.itcarlow.ie/bbcswebdav/pid-940198-dt-content-rid-5593562_1/xid-5593562_1
// https://stackoverflow.com/questions/70387265/manual-enqueue-and-dequeue-in-java
// https://stackoverflow.com/questions/45814389/how-to-write-the-clear-method-in-the-list-data-structure
// (Queue Chapter 4 powerpoint)

package Application;

// Play Queue
public class PlayQueue 
{

    private int front;
    private int rear;

    // create an array to store the tracks
    private Application.Track[] Queue = new Application.Track[10];

    // constructor
    public PlayQueue(Track[] tracks) // CreateQueue algorithm
    {
        Queue = new Track[10];
        for (int i = 0; i < tracks.length; i++) // copy the tracks into the array
        {
            Queue[i] = tracks[i]; // can be 0 or 1
        }
        front = 0;
        rear = 1;
    }

    // add a track
    public void addTrack(String songName, String artistName) 
    {
        Application.Track track = new Track(songName, artistName);
        if (rear < Queue.length) 
        {
            Queue[rear] = track;
            rear++;
            System.out.println(songName + " by " + artistName + " has been added to the play queue.");
        } 
        else 
        {
            System.out.println("Play Queue is full");
        }
    }


   //public Track see next track
   // return Queue[front]
    public void seeNextTrack()
    {
        if (! isEmpty()) 
        {
            Track nextTrack = Queue[front];
            System.out.println("Next track: " + nextTrack.getSongName() + " by " + nextTrack.getArtist());
        } 
        else 
        {
            System.out.println("Play Queue is empty");

        }
    }

    public void clearQueue()
    {
        for (int i = 0; i < rear; i++) 
        {
            Queue[i] = null;
        }

        rear = front; // reset
        System.out.println("Play Queue has been cleared");
    }

    // remove tracks by artist
    public void remove(String artistName)
    {
        if (! isEmpty()) {
            for (int i = front; i < rear; i++) // loop through the array
            {
                if (Queue[i].getArtist().equals(artistName)) 
                {
                    moveLeft(i); // can be 0 or 1
                    rear--;
                    i--;
                }
            }
            System.out.println("Removed tracks by " + artistName);
        }
        else
        {
            System.out.println("Play Queue is empty"); // print if the queue is empty
        }

    }   


    private void moveLeft(int index) {
        // shift elements to the left starting from the specified index
        for (int i = index; i < rear - 1; i++) 
        {
            Queue[i] = Queue[i + 1];
        }
        Queue[rear - 1] = null; // clear the last position
    }

    public void printQueue() {
        System.out.println("Current play queue:");
        for (int i = 0; i < rear; i++) 
        {
            System.out.println(Queue[i].getSongName() + " by " + Queue[i].getArtist()); // print each track
        }
    }
    public int size() {
        return rear - front; // correctly calculate size based on front and rear
    }

    
    boolean isEmpty() {
        return (rear == front); // check if the queue is empty
    } 

}
