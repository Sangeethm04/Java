package Chapt5;
public class Countries
{
  public static void main(String[] args)
  {
       // 1. Declare 4 arrays and initialize them to the given values.
       // Countries: China, Egypt, France, Germany, India, Japan, Kenya, Mexico, United Kingdom, United States

       // Capitals: Beijing, Cairo, Paris, Berlin, New Delhi, Tokyo, Nairobi, Mexico City, London, Washington D.C.

       // Languages: Chinese, Arabic, French, German, Hindi, Japanese, Swahili, Spanish, English, English

       // Filenames for map images: China.jpg, Egypt.jpg, France.jpg, Germany.jpg, India.jpg, Japan.jpg, Kenya.jpg, Mexico.jpg, UK.jpg, US.jpg
        String[] countries = {"China", "Egypt", "France", "Germany", "India", "Japan", "Kenya", "Mexico", "United Kingdom", "United States"};
        String[] capitals = {"Bejing", "Cairo", "Paris", "Berlin", "New Delhi", "Tokyo", "Nairobi", "Mexico City", "London", "Washington D.C."};
        String[] languages = {"Chinese", "Arabic", "French", "German", "Hindi", "Japanese", "Swahili", "Spanish", "English", "English"};
        String[] images = {"China.jpg", "Egypt.jpg", "France.jpg", "Germany.jpg", "India.jpg", "Japan.jpg", "Kenya.jpg", "Mexico.jpg"," UK.jpg", "US.jpg"};
        
        // 2. Pick a random number up to the length of one of the arrays and save in the variable index
        int index = (int)(Math.random() * countries.length);
       // 3. Print out the info in each array using the random index
        System.out.println("Country: " + countries[index]);
        System.out.println("Capital: " + capitals[index]);
        System.out.println("Language: " + languages[index]);
        System.out.println("Map: " + images[index] + ".jpg");
       // Example of showing image files using an array called images (your array name above may be different)
       // (this will only work in Active Code)
        Countries obj = new Countries();
       obj.printHTMLimage(images[index] );
    };

   // This method will just work in Active Code which interprets html
   public void printHTMLimage(String filename)
   {
     String baseURL = "https://raw.githubusercontent.com/bhoffman0/CSAwesome/master/_sources/Unit6-Arrays/6-1-images/";
     System.out.print("<img src=" + baseURL + filename + ">");

          /*Create an array called day2 that will hold 7 String elements. Those elements are: "Sun","Mon","Tue","Wed","Thu","Fri","Sat"*/


   }
  }
  