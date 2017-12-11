package test.mailhub;

/**
 * Created by moshw on 12/7/2017.
 */

public class MessageElements {
    public String userName;
    public String messageDate;
    public String messageTime;
    public String messagePreview;//actual sent message

    public MessageElements(String userName, String messageDate, String messageTime, String messagePreview) {
        this.userName = userName;
        this.messageDate = messageDate;
        this.messageTime = messageTime;
        this.messagePreview = messagePreview;
    }

    public String getUserName() {
        return userName;
    }

    public String getMessageDate() {
        return messageDate;
    }

    public String getMessageTime() {
        return messageTime;
    }

    public String getMessagePreview() {
        return messagePreview;
    }
}
