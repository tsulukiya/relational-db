package lesson5.part2;

import java.util.Date;

public class ForumPosts {
    private long Id;
    private ForumSubcategories subcategories;
    private Users user;
    private long parentPost;
    private String title;
    private StringBuilder content;
    private boolean isPoll;
    private Date dateLoaded;
    private String ip;

    public ForumPosts(long id, ForumSubcategories subcategories, Users user, long parentPost, String title,
                      StringBuilder content, boolean isPoll, Date dateLoaded, String ip) {
        Id = id;
        this.subcategories = subcategories;
        this.user = user;
        this.parentPost = parentPost;
        this.title = title;
        this.content = content;
        this.isPoll = isPoll;
        this.dateLoaded = dateLoaded;
        this.ip = ip;
    }

    public ForumPosts(long id) {
        Id = id;
    }
}
