import org.openqa.selenium.By;

public class Elements {

    static By recyclerView = By.id("tr.abdullah.notes:id/notesRecyclerView");
    static By addNoteButton = By.id("tr.abdullah.notes:id/addButton");
    static By addNoteText = By.id("tr.abdullah.notes:id/addNoteHeading");
    static By titleEditText = By.id("tr.abdullah.notes:id/titleEditText");
    static By contentEditText = By.id("tr.abdullah.notes:id/contentEditText");
    static By saveNoteButton = By.id("tr.abdullah.notes:id/saveButton");
    static By dateTime = By.id("tr.abdullah.notes:id/dateTimeTextView");


    static By noteCard = By.xpath("//android.widget.FrameLayout[@resource-id=\"tr.abdullah.notes:id/noteCardView\"]/android.widget.LinearLayout");
    static By noteTitle = By.id("tr.abdullah.notes:id/noteHeading");
    static By editNoteButton = By.id("tr.abdullah.notes:id/updateButton");
    static By editNoteText = By.id("tr.abdullah.notes:id/editNoteHeading");
    static By editNoteTitle = By.id("tr.abdullah.notes:id/updateTitleEditText");
    static By editNoteContent = By.id("tr.abdullah.notes:id/updateContentEditText");
    static By saveEditingNoteBtn = By.id("tr.abdullah.notes:id/updateSaveButton");


    static By deleteConfirmBtn = By.id("android:id/button1");
}