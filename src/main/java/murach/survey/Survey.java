package murach.survey;

public class Survey {
    private String firstName;
    private String lastName;
    private String email;
    private String dob;
    private String hearAbout;
    private String wantsUpdates;
    private String emailAnnouncements; 
    private String contact;      

    public Survey(String firstName, String lastName, String email, String dob,
                  String hearAbout, String wantsUpdates, String emailAnnouncements, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.hearAbout = hearAbout;
        this.wantsUpdates = wantsUpdates;
        this.emailAnnouncements = emailAnnouncements;
        this.contact = contact;
    }

    // --- GETTERS (đủ dùng cho JSP) ---
    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName; }
    public String getEmail()     { return email; }
    public String getDob()       { return dob; }
    public String getHearAbout() { return hearAbout; }
    public String getWantsUpdates() { return wantsUpdates; }
    public String getEmailAnnouncements() { return emailAnnouncements; }
    public String getContact() { return contact; }
}
