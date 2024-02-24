import org.junit.Test;

public class Runner extends BaseTest {

    private Methods methods = new Methods();

    @Test
    public void startTest() {

        // Not Ekleme Testi
        // ------------------------------------------------------------------
        methods.checkPage(Elements.recyclerView, "Notlar listesi");
        methods.clickElement(Elements.addNoteButton);
        methods.checkPage(Elements.addNoteText, "Not ekleme");
        methods.clickElement(Elements.titleEditText);
        methods.enterText(Elements.titleEditText, "Not Başlığı");
        methods.clickElement(Elements.contentEditText);
        methods.enterText(Elements.contentEditText, "Not İçeriği");
        methods.clickElement(Elements.saveNoteButton);
        methods.checkPage(Elements.recyclerView, "Notlar listesi");
        methods.checkDateTime(Elements.dateTime);
        // -----------------------------------------------------------------


    }
}