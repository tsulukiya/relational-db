package lesson5.part2;

import java.util.Date;

public class ForumPollsOptions {
    private long id;
    private ForumPosts forumPost;
    private String title;
    private Date datePolls;

    public ForumPollsOptions(long id, ForumPosts forumPost, String title, Date datePolls) {
        this.id = id;
        this.forumPost = forumPost;
        this.title = title;
        this.datePolls = datePolls;
    }

    public ForumPollsOptions(long id) {
        this.id = id;
    }
}
