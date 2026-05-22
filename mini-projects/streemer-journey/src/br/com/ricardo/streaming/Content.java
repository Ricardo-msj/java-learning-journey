package src.br.com.ricardo.streaming;

public class Content {
    private String title = null;
    private int realeaseYear = 0;
    private boolean premium = false;
    private int rating = 0;
    private int totalReviews = 0;

    //add o titulo
    public void setTitle(String title) {
        this.title = title;
    }

    // add o ano de lançamento
    public void setRealeaseYear(int realeaseYear) {
        this.realeaseYear = realeaseYear;
    }

     //add uma avaliação
    public String addRating(int rating) {

        if (rating <= 0 || rating < 5)
        {
            return "Rating Invalid!!!";
        }

        else
        {
            totalReviews++;
            this.rating += rating;
            return "Rating added successfully";
        }
    }

    //devolve o número total de avaliações.
    public int getTotalReviews() {
        return totalReviews;
    }

    //devolve a avaliação final
    public int getRating() {
        
        return rating = rating / totalReviews;
    }


}

