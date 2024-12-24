import classes.Faculty;
import classes.Institute;
import classes.ResearchAssociate;

public class Main {

    public static void main(String[] args) {
        Faculty fkn = new Faculty("ФКН");
        Institute toizi = new Institute("ТОиЗИ", "297");
        Institute is = new Institute("ИС", "387");
        Institute tst = new Institute("ЦТ", "311п");
        Institute itu = new Institute("ИТУ", "312п");
        Institute piit = new Institute("ПиИТ", "380");
        fkn.setInstitutes(new Institute[]{toizi, is, tst, itu, piit});
        ResearchAssociate emp1 = new ResearchAssociate(1234, "Чекмарев Андрей Игоревич",
                "защита информации");
        ResearchAssociate emp2 = new ResearchAssociate(1234, "Соломатин Дмитрий Иванович",
                "моделирование систем");
        ResearchAssociate emp3 = new ResearchAssociate(1234, "Тарасов Вячеслав Сергеевич",
                "интеллектуальные системы");
        ResearchAssociate emp4 = new ResearchAssociate(1234, "Нужных Алексей Васильевич",
                "распознавание образов");
        ResearchAssociate emp5 = new ResearchAssociate(1234, "Тюкачев Николай Аркадиевич",
                "технологии обработки информации");
        piit.setEmployees(new ResearchAssociate[]{emp1, emp2, emp3, emp4, emp5});
        Institute[] fkn_institutes = fkn.getInstitutes();
        System.out.println("Кафедры на факультете " + fkn.getName() + ": \n");

        for (Institute fkn_institute : fkn_institutes) {
            System.out.println(fkn_institute.getName());
        }
        System.out.println("\n");
        ResearchAssociate[] piit_employees = piit.getEmployees();
        System.out.println("Сотрудники кафедры " + piit.getName() + ": \n");
        for (ResearchAssociate piit_employee : piit_employees) {
            System.out.println(piit_employee.getName());
        }
    }
}