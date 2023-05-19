package sg.edu.rp.c346.id22020383.mymodules;

public class Module {
    private String moduleCode;
    private String moduleName;
    private int academicYear;
    private int semester;
    private int moduleCredit;
    private String venue;

    public String getModuleCode() {
        return moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public Module(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public int getModuleCredit() {
        return moduleCredit;
    }

    public String getVenue() {
        return venue;
    }

    public int getSemester() {
        return semester;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public Module(String moduleCode, String moduleName, int academicYear, int semester, int moduleCredit, String venue) {
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
        this.academicYear = academicYear;
        this.semester = semester;
        this.moduleCredit = moduleCredit;
        this.venue = venue;
    }

}
