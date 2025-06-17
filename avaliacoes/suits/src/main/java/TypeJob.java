public abstract class TypeJob {
 
    private String name;
    private String type;
    private String description;
    private int salary;
    private int experienceLevel;

    public TypeJob() {
        this.name = "Unknown";
        this.type = "Unknown";
        this.description = "Unknown";
        this.salary = 0;
        this.experienceLevel = 0;
    }

    public TypeJob(String name, String type, String description, int salary, int experienceLevel) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.salary = salary;
        this.experienceLevel = experienceLevel;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperienceLevel() {
        return this.experienceLevel;
    }

    public void setExperienceLevel(int experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

}