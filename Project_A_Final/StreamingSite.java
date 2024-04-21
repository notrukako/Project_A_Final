// Main class for the streaming website management system
public class StreamingSite {
    public static void main(String[] args) {
        // Create media items
        Media movie1 = new Movie("The Matrix","Test","1999", 120.0, true,MediaType.MOVIE,MovieGenre.ACTION);
        Media movie2 = new Movie("Inception", "A","2000", 150.0,true, MediaType.MOVIE,MovieGenre.SCI_FI);
        Media anime1 = new Anime("Naruto", genre.SHOUNEN, 1,25, "Toei", true, MediaType.ANIME, 25.0);
        // Media anime2 = new Media("Attack on Titan", "Action", 30.0, MediaType.ANIME);
        // Media podcast1 = new Media("The Joe Rogan Experience", "Talk", 60.0, MediaType.PODCAST);
        // Media podcast2 = new Media("Close The Door", "Talk", 45.0, MediaType.PODCAST);

        // Create a subscriber
        Subscribers subscriber = new Subscribers("Alice");

        // Subscriber watches media items
        subscriber.watchMedia("M1", movie1);
        subscriber.watchMedia("M2", movie2);
        subscriber.watchMedia("A1", anime1);
        // subscriber.watchMedia("A2", anime2);
        // subscriber.watchMedia("P1", podcast1);
        // subscriber.watchMedia("P2", podcast2);

        // Subscriber adds media items to favorites
        subscriber.addFavorite("M1", movie1);
        subscriber.addFavorite("A1", anime1);
        // subscriber.addFavorite("P1", podcast1);
        
        // Display watched media items
        subscriber.displayWatchedMedia();

        // Display favorite media items
        subscriber.displayFavoriteItems();
    }
}
