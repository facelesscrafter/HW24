package hw24;

public enum StudyProfile {
    MEDICINE("Медицина"),
    MACKDONALDSTAFF("Филология"), // =)
    ONEMOREMACKDONALDSTAFF("Экономика"),
    PSYCHOLOGY("Психология"),
    PHYSICS("Физика"),
    CHEMISTRY("Химия"),
    AWESOMEGUYS("Программирование");
    String profileName;

    StudyProfile(String profileName) {
        this.profileName=profileName;
    }
}
