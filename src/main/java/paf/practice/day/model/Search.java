package paf.practice.day.model;

public class Search {
    private String bookId;
    private String title;
    private String description;
    private String image;
    private float rating;

    @Override
    public String toString() {
        return "Search [bookId=" + bookId + ", title=" + title + ", description=" + description + ", image=" + image
                + ", rating=" + rating + "]";
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

}
