import classes.AdministrativeEmployee;
import classes.Employee;
import classes.Faculty;
import classes.University;
import classes.Institute;
import classes.ResearchAssociate;

public class Main {
    public static void main (String[] args) {
        University university = new University();

        Employee dean = new AdministrativeEmployee(123, "Dean Smith", "dean@example.com");
        Faculty faculty = new Faculty("Faculty of Computer Science", dean);
        university.addFaculty(faculty);

        Institute institute = new Institute("Voronezh State University", "123 Main St");
        faculty.addInstitute(institute);

        ResearchAssociate researcher = new ResearchAssociate(456, "John Doe", "john@example.com", "Physics");
        institute.setResearchAssociate(researcher);

        university.displayFaculties();
        faculty.displayInstitutes();
    }
}
