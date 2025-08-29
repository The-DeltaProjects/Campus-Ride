package za.ca.cput.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
public class Notifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificationId;

    private String title;
    private String message;
    private LocalDateTime sentTime;
    private boolean isRead;

    @Column(name = "recipient_id")
    private Long recipientId;

    @Column(name = "recipient_role")
    private String recipientRole;

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
                ", recipientId=" + recipientId +
                ", recipientRole='" + recipientRole + '\'' +
                '}';
    }

    public static class Builder {
        private Long notificationId;
        private String title;
        private String message;
        private LocalDateTime sentTime;
        private boolean isRead;
        private Long recipientId;
        private String recipientRole;


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

        public Builder setRead(boolean read) {
            isRead = read;
            return this;
        }

        public Builder setRecipientId(Long recipientId) {
            this.recipientId = recipientId;
            return this;
        }

        public Builder setRecipientRole(String recipientRole) {
            this.recipientRole = recipientRole;
            return this;
        }

        public Builder copy(Builder builder) {
            return new Builder()
                    .setNotificationId(this.notificationId)
                    .setTitle(this.title)
                    .setMessage(this.message)
                    .setSentTime(this.sentTime)
                    .setRead(this.isRead)
                    .setRecipientId(this.recipientId)
                    .setRecipientRole(this.recipientRole);
        }

        public Notifications build() {
            return new Notifications(this);
        }
    }
}
