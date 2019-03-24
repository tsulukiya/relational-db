package lesson5.part2;

import java.util.Date;

public class ForumCategories {
    private long id;
    private String title;
    private String description;
    private Date dateCreatedCategory;
    private String ip;

    public ForumCategories(long id, String title, String description, Date dateCreatedCategory, String ip) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dateCreatedCategory = dateCreatedCategory;
        this.ip = ip;
    }

    public ForumCategories(long id) {
        this.id = id;
    }
}
