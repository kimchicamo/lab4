import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    //private ArrayList<MusicTrack> track;
    // private ArrayList<Book> library;  
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        //ArrayList<student> cs101 = new ArrayList<>();
        //int count = 5;
        //ArrayList<student> cs101 = new ArrayList<Book> library;
        files = new ArrayList<>();
        /*
         * library = new ArrayList<>();
         * library = new ArrayList<Book;
         * 
         * tracks =  new ArrayList<>();
         * tracks =  new ArrayList<MusicTrack>;
         * 
         * ArrayList<student> items = new ArrayList<>();
         * items.add("song"); // index 0
         * items.add("song"); // index 1
         * items.add("song"); // index 2
         * items.add("song"); // index 3
         * items.add("song"); // index 4
         * items.add("song"); // index 5
         * 
         * String filename =  items.get(4); // filename = "song 5"
         * 
         * files.add(favoriteTrack);
         * 
         */
        ArrayList<String> items = new ArrayList<>();
        items.add("song1"); // index 0
        items.add("song2"); // index 1
        items.add("song3"); // index 2
        items.add("song4"); // index 3
        items.add("song5"); // index 4
        items.add("song6"); // index 5
        items.add("song7"); // index 6
        items.remove(2);
        // dates.remove2 
        String filename =  items.get(4); // filename = "song 5"
        System.out.println("Retrieving 5th elememt of items: " + filename);
        
        String favouriteTrack = "My favourite song";
        files.add(favouriteTrack);
        int indexOfLast = files.size()-1;
        System.out.println("Retrieving 5th elememt of items: " + files.get(indexOfLast));
        
    
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }
    public void checkIndex(int index) {
    if(index >= 0 && index < files.size()) {
      //System.out.println();
    }
    else{
        System.out.println("ERROR: the valid range is 0 - "+ (files.size()-1));
    }
    }
    public boolean validIndex(int index) {
    if (index >= 0 && index < files.size()) {
       return false;
    }
    else{
        return true;
    }
    }
        
    
}
