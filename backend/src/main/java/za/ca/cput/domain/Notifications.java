package za.ca.cput.domain;

import java.time.LocalDateTime;

public class Notifications {
    private Long notificationId;
    private String title;
    private String message;
    private LocalDateTime sentTime;
    private boolean isRead;

    protected Notifications() {

    }

    private Notifications(Builder builder) {
        this.notificationId = builder.notificationId;
        this.title = builder.title;
        this.message = builder.message;
        this.sentTime = builder.sentTime;
        this.isRead = builder.isRead;
    }

    public Long getNotificationId() {
        return notificationId;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getSentTime() {
        return sentTime;
    }

    public boolean isRead() {
        return isRead;
    }

    @Override
    public String toString() {
        return "Notifications{" +
                "notificationId=" + notificationId +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", sentTime=" + sentTime +
                ", isRead=" + isRead +
                '}';
    }

    public static class Builder {
        private Long notificationId;
        private String title;
        private String message;
        private LocalDateTime sentTime;
        private boolean isRead;

        public Builder setNotificationId(Long notificationId) {
            this.notificationId = notificationId;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setSentTime(LocalDateTime sentTime) {
            this.sentTime = sentTime;
            return this;
        }

        public Builder setRead(boolean isRead) {
            this.isRead = isRead;
            return this;
        }

        public Builder copy(Builder builder) {
            return new Builder()
                    .setNotificationId(this.notificationId)
                    .setTitle(this.title)
                    .setMessage(this.message)
                    .setSentTime(this.sentTime)
                    .setRead(this.isRead);
        }

        public Notifications build() {
            return new Notifications(this);
        }
    }
}
