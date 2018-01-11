import edu.duke.*;
import java.util.*;

public class CodonCount
{
    // instance variables
    private HashMap<String, Integer> DNAmap;

    /**
     * Constructor for objects of class CodonCount
     */
    public CodonCount()
    {
        // initialise instance variables
        DNAmap = new HashMap<String, Integer>();
    }

    /**
     * The method builds a new map of codons mapped to their counts from
     * the string dna with the reading frame with the position start
     * @param  start
     * @param  dna
     * @return  Nothing
     */
     private void buildCodonMap(int start, String dna)
    {
      DNAmap.clear(); // make the map is empty before building it
      String current;
