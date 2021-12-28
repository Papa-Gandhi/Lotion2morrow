package lotion2morrow.dummydata;

import lotion2morrow.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieData {

    private static Movie movie;
    public static List<Movie> movies = new ArrayList<>();

    private static List<Movie> getMovies() {
        List<Movie> result = new ArrayList<>();

        // Movie number 1
        movie = new Movie();
        movie.setName("Spider-Man: Far from Home");
        movie.setDate("2019");
        movie.setCoverSrc("images/movies/movie1.jpg");
        movie.setDirector("Jon Watts");
        movie.setStars(List.of(
                "Tom Holland", "Samuel L. Jackson",
                "Jake Gyllenhaal", "Marisa Tomei"
        ));
        movie.setGenre(List.of(
                "Action", "Adventure", "Sci-Fi"
        ));
        movie.setRelease("2019-06-28");
        movie.setRating("7.9 from IMDb");
        movie.setStory("Our friendly neighborhood Super Hero " +
                "decides to join his best friends Ned, MJ, " +
                "and the rest of the gang on a European vacation. " +
                "However, Peter's plan to leave super heroics behind " +
                "for a few weeks are quickly scrapped when he begrudgingly " +
                "agrees to help Nick Fury uncover the mystery of several " +
                "elemental creature attacks, creating havoc across the continent.");
        movie.setVideoSrc("");

        // Movie number 2
        movie = new Movie();
        movie.setName("Rumble");
        movie.setDate("2022");
        movie.setCoverSrc("images/movies/movie2.jpg");
        movie.setDirector("Hamish Grieve");
        movie.setStars(List.of(
                "Geraldine Viswanathan", "Will Arnett", "Stephen A. Smith"
        ));
        movie.setGenre(List.of(
                "Adventure", "Animation", "Comedy"
        ));
        movie.setRelease("2022-02-18");
        movie.setRating("");
        movie.setStory("In a world where monster wrestling is a global sport " +
                "and monsters are superstar athletes, teenage Winnie seeks to " +
                "follow in her father's footsteps by coaching a loveable underdog " +
                "monster into a champion.");
        movie.setVideoSrc("");

        // Movie number 3
        movie = new Movie();
        movie.setName("The Amazing Spider-Man");
        movie.setDate("2012");
        movie.setCoverSrc("images/movies/movie3.jpg");
        movie.setDirector("Marc Webb");
        movie.setStars(List.of(
                "Andrew Garfield", "Emma Stone", "Rhys Ifans"
        ));
        movie.setGenre(List.of(
                "Action", "Adventure"
        ));
        movie.setRelease("2012-07-03");
        movie.setRating("7 from IMDb");
        movie.setStory("Peter Parker (Garfield) is an outcast high schooler who was abandoned by his parents as a boy, " +
                "leaving him to be raised by his Uncle Ben (Sheen) and Aunt May (Field). Like most teenagers, " +
                "Peter is trying to figure out who he is and how he got to be the person he is today. " +
                "Peter is also finding his way with his first high school crush, Gwen Stacy (Stone), " +
                "and together, they struggle with love, commitment, and secrets. " +
                "As Peter discovers a mysterious briefcase that belonged to his father, " +
                "he begins a quest to understand his parents' disappearance - leading him directly to Oscorp and the lab of Dr. Curt Connors (Ifans), " +
                "his father's former partner. As Spider-Man is set on a collision course with Connors' alter-ego, " +
                "The Lizard, Peter will make life-altering choices to use his powers and shape his destiny to become a hero.");
        movie.setVideoSrc("");

        // Movie number 4
        movie = new Movie();
        movie.setName("Venom: Let There Be Carnage");
        movie.setDate("2021");
        movie.setCoverSrc("images/movies/movie4.jpg");
        movie.setDirector("Andy Serkis");
        movie.setStars(List.of(
                "Tom Hardy", "Woody Harrelson", "Michelle Williams"
        ));
        movie.setGenre(List.of(
                "Action", "Adventure", "Sci-Fi"
        ));
        movie.setRelease("2021-10-01");
        movie.setRating("6.3 from IMDb");
        movie.setStory("Eddie Brock attempts to reignite his career by interviewing serial killer Cletus Kasady, " +
                "who becomes the host of the symbiote Carnage and escapes prison after a failed execution.");
        movie.setVideoSrc("");

        // Movie number 5
        movie = new Movie();
        movie.setName("Spider-Man: Homecoming");
        movie.setDate("2017");
        movie.setCoverSrc("images/movies/movie5.jpg");
        movie.setDirector("Jon Watts");
        movie.setStars(List.of(
                "Tom Holland", "Michael Keaton", "Robert Downey Jr"
        ));
        movie.setGenre(List.of(
                "Action", "Adventure", "Sci-Fi"
        ));
        movie.setRelease("2017-07-06");
        movie.setRating("7.8 from IMDb");
        movie.setStory("Thrilled by his experience with the Avengers, Peter returns home, where he lives with his Aunt May, " +
                "under the watchful eye of his new mentor Tony Stark, Peter tries to fall back into his normal daily routine - " +
                "distracted by thoughts of proving himself to be more than just your friendly neighborhood Spider-Man - " +
                "but when the Vulture emerges as a new villain, everything that Peter holds most important will be threatened.");
        movie.setVideoSrc("");

        // Movie number 6
        movie = new Movie();
        movie.setName("Spider-Man");
        movie.setDate("2002");
        movie.setCoverSrc("images/movies/movie6.jpg");
        movie.setDirector("Sam Raimi");
        movie.setStars(List.of(
                "Tobey Maguire", "Kirsten Dunst", "Willem Dafoe"
        ));
        movie.setGenre(List.of(
                "Action", "Adventure"
        ));
        movie.setRelease("2002-05-03");
        movie.setRating("7.3 from IMDb");
        movie.setStory("Based on Marvel Comics' superhero character, this is a story of Peter Parker who is a nerdy high-schooler. " +
                "He was orphaned as a child, bullied by jocks, and can't confess his crush for his stunning neighborhood girl Mary Jane Watson. " +
                "To say his life is \"miserable\" is an understatement. But one day while on an excursion to a laboratory a runaway radioactive spider bites him... " +
                "his life changes in a way no one could have imagined. Peter acquires a muscle-bound physique, " +
                "clear vision, ability to cling to surfaces and crawl over walls, shooting webs from his wrist ... " +
                "but the fun isn't going to last. An eccentric millionaire Norman Osborn administers a performance enhancing drug on himself and his maniacal alter ego Green Goblin emerges. " +
                "Now Peter Parker has to become Spider-Man and take Green Goblin to the task... " +
                "or else Goblin will kill him. They come face to face and the war begins in which only one of them will survive at the end.");
        movie.setVideoSrc("");

        // Movie number 7
        movie = new Movie();
        movie.setName("Spider-Man 2");
        movie.setDate("2004");
        movie.setCoverSrc("images/movies/movie7.jpg");
        movie.setDirector("Sam Raimi");
        movie.setStars(List.of(
                "Tobey Maguire", "Kirsten Dunst", "Alfred Molina"
        ));
        movie.setGenre(List.of(
                "Action", "Adventure"
        ));
        movie.setRelease("2004-06-30");
        movie.setRating("7.3 from IMDb");
        movie.setStory("Peter Parker is an unhappy man: after two years of fighting crime as Spider-Man, " +
                "his life has begun to fall apart. The girl he loves is engaged to someone else, " +
                "his grades are slipping, he cannot keep any of his jobs, and on top of it, " +
                "the newspaper Daily Bugle is attacking him viciously, claiming that Spider-Man is a criminal. " +
                "He reaches the breaking point and gives up the crime fighter's life, once and for all. " +
                "But after a failed fusion experiment, eccentric and obsessive scientist Dr. Otto Octavius " +
                "is transformed into super villain Doctor Octopus, Doc Ock for short, " +
                "having four long tentacles as extra hands. Peter guesses it might just be time for Spider-Man " +
                "to return, but would he act upon it?");
        movie.setVideoSrc("");

        // Movie number 8
        movie = new Movie();
        movie.setName("Spider-Man 3");
        movie.setDate("2007");
        movie.setCoverSrc("images/movies/movie8.jpg");
        movie.setDirector("Sam Raimi");
        movie.setStars(List.of(
                "Tobey Maguire", "Kirsten Dunst", "Topher Grace"
        ));
        movie.setGenre(List.of(
                "Action", "Adventure"
        ));
        movie.setRelease("2007-05-04");
        movie.setRating("6.2 from IMDb");
        movie.setStory("Peter Parker has finally managed to piece together the once-broken parts of his life, " +
                "maintaining a balance between his relationship with Mary-Jane and " +
                "his responsibility as Spider-Man. But more challenges arise for our young hero. " +
                "Peter's old friend Harry Obsourne has set out for revenge against Peter; " +
                "taking up the mantle of his late father's persona as The New Goblin, and " +
                "Peter must also capture Uncle Ben's real killer, Flint Marko, " +
                "who has been transformed into his toughest foe yet, the Sandman. " +
                "All hope seems lost when suddenly Peter's suit turns jet-black and greatly amplifies his powers. " +
                "But it also begins to greatly amplify the much darker qualities of Peter's personality that he begins to lose himself to. " +
                "Peter has to reach deep inside himself to free the compassionate hero he used to be if he is to ever conquer the darkness within " +
                "and face not only his greatest enemies, but also...himself.");
        movie.setVideoSrc("");

        // Movie number 9
        movie = new Movie();
        movie.setName("Spider-Man: Into the Spider-Verse");
        movie.setDate("2018");
        movie.setCoverSrc("images/movies/movie9.jpg");
        movie.setDirector("Bob Persichetti");
        movie.setStars(List.of(
                "Shameik Moore", "Jake Johnson", "Hailee Steinfeld", "Mahershala Ali"
        ));
        movie.setGenre(List.of(
                "Action", "Adventure", "Animation", "Family", "Sci-Fi"
        ));
        movie.setRelease("2018-12-12");
        movie.setRating("8.6 from IMDb");
        movie.setStory("Miles Morales is a New York teen struggling with school, " +
                "friends and, on top of that, being the new Spider-Man. " +
                "When he comes across Peter Parker, the erstwhile saviour of New York, " +
                "in the multiverse, Miles must train to become the new protector of his city.");
        movie.setVideoSrc("");

        // Movie number 10
        movie = new Movie();
        movie.setName("The Matrix Resurrections");
        movie.setDate("2021");
        movie.setCoverSrc("images/movies/movie10.jpg");
        movie.setDirector("Lana Wachowski");
        movie.setStars(List.of(
                "Keanu Reeves", "Carrie-Anne Moss", "Yahya Abdul-Mateen II"
        ));
        movie.setGenre(List.of(
                "Action", "Sci-Fi"
        ));
        movie.setRelease("2021-12-22");
        movie.setRating("6.7 from IMDb");
        movie.setStory("Return to a world of two realities: one, everyday life; " +
                "the other, what lies behind it. To find out if his reality is a construct, " +
                "to truly know himself, Mr. Anderson will have to choose to follow the white rabbit once more.");
        movie.setVideoSrc("");

        // Movie number 11
        movie = new Movie();
        movie.setName(" Resident Evil: Welcome to Raccoon City");
        movie.setDate("2021");
        movie.setCoverSrc("images/movies/movie11.jpg");
        movie.setDirector("Johannes Roberts");
        movie.setStars(List.of(
                "Kaya Scodelario", "Robbie Amell", "Hannah John-Kamen"
        ));
        movie.setGenre(List.of(
                "Action", "Horror", "Sci-Fi"
        ));
        movie.setRelease("2021-11-24");
        movie.setRating("5.6 from IMDb");
        movie.setStory("Set in 1998, this origin story explores the secrets of the mysterious " +
                "Spencer Mansion and the ill-fated Raccoon City.");
        movie.setVideoSrc("");

        // Movie number 12
        movie = new Movie();
        movie.setName("The Amazing Spider-Man 2");
        movie.setDate("2014");
        movie.setCoverSrc("images/movies/movie12.jpg");
        movie.setDirector("Marc Webb");
        movie.setStars(List.of(
                "Andrew Garfield", "Emma Stone", "Jamie Foxx"
        ));
        movie.setGenre(List.of(
                "Action", "Adventure", "Sci-Fi"
        ));
        movie.setRelease("2014-05-02");
        movie.setRating("6.7 from IMDb");
        movie.setStory("We've always known that Spider-Man's most important conflict has been within himself: " +
                "the struggle between the ordinary obligations of Peter Parker and " +
                "the extraordinary responsibilities of Spider-Man. " +
                "But in The Amazing Spider-Man 2, Peter Parker finds that his greatest battle is about to begin. " +
                "It's great to be Spider-Man. For Peter Parker, " +
                "there's no feeling quite like swinging between skyscrapers, " +
                "embracing being the hero, and spending time with Gwen. " +
                "But being Spider-Man comes at a price: only Spider-Man can protect his fellow New Yorkers " +
                "from the formidable villains that threaten the city. " +
                "With the emergence of Electro, Peter must confront a foe far more powerful " +
                "than he. And as his old friend, Harry Osborn, returns, " +
                "Peter comes to realize that all of his enemies have one thing in common: Oscorp.");
        movie.setVideoSrc("");

        return result;
    }

}
