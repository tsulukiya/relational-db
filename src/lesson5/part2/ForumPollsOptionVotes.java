package lesson5.part2;

import java.util.Date;

public class ForumPollsOptionVotes {
    private long id;
    private ForumPollsOptions pollsOptions;
    private Users users;
    private Date dateVotes;
    private String ip;

    public ForumPollsOptionVotes(long id, ForumPollsOptions pollsOptions, Users users, Date dateVotes, String ip) {
        this.id = id;
        this.pollsOptions = pollsOptions;
        this.users = users;
        this.dateVotes = dateVotes;
        this.ip = ip;
    }

    public ForumPollsOptionVotes(long id) {
        this.id = id;
    }
}
