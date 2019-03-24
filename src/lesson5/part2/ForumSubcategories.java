package lesson5.part2;

import java.util.Date;

public class ForumSubcategories {
    private long id;
    private ForumCategories categories;
    private String title;
    private String description;
    private Date dateSubcat;
    private String ip;

    public ForumSubcategories(long id, ForumCategories categories, String title, String description, Date dateSubcat, String ip) {
        this.id = id;
        this.categories = categories;
        this.title = title;
        this.description = description;
        this.dateSubcat = dateSubcat;
        this.ip = ip;
    }

    public ForumSubcategories(long id) {
        this.id = id;
    }
}
