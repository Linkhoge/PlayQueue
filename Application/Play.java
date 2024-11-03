package Application;

public class Play 
{
        public static void main(String[] args) 
        {
            Track[] tracks = new Track[] { 
                new Track("Coming Home", "P Diddy"), 

            }; // Ain't no party like a diddy party (Initialize the tracks array)

            // You can now use the queue object to perform operations on the tracks
            PlayQueue queue = new PlayQueue(tracks);
            
            queue.remove("P Diddy"); // removes P Diddy

            
            // Add some tracks to the queue
            queue.addTrack("Espresso", "Sabrina");
            queue.addTrack("Too sweet", "Hozier");
            queue.seeNextTrack();
            queue.addTrack("Austin", "Dasha");
            System.out.println("Queue size: " + queue.size());
            queue.addTrack("Taste", "Sabrina");
            queue.addTrack("WildFlower", "Billie");

            queue.remove("Sabrina");
            System.out.println("Queue size: " + queue.size());
            queue.printQueue();
            queue.clearQueue();
            queue.printQueue();

        
        }
    }