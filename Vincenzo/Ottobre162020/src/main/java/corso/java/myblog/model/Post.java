package corso.java.myblog.model;

public class Post {
    public final long id;
    public final long userId;
    public final String title;
    public final String body;

    private Post(long id, long userId, String title, String body) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s", id, title);
    }

    public static class Builder {
        private long id;
        private long userId;
        private String title;
        private String body;

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Builder withUserId(long userId) {
            this.userId = userId;
            return this;
        }

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder withBody(String body) {
            this.body = body;
            return this;
        }

        public Post build() {
            return new Post(id, userId, title, body);
        }
    }
}
