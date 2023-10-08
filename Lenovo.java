public class Lenovo 
{
	int numberOfModels;
    int numberOfEmployees;
    String modelName;
    String CEO;
    int yearFounded;
    int totalRevenue;
    boolean isPublic;
    int marketShare;
    static String companyHQ;
    static String companyCountry;
    static int foundingYear;

    static 
	{
        companyHQ="Beijing";
        companyCountry="China";
        foundingYear=1984;
    }

    public Lenovo(int numberOfModels,int numberOfEmployees,String modelName,String CEO,int yearFounded,int totalRevenue,boolean isPublic,int marketShare) {
        this.numberOfModels=numberOfModels;
        this.numberOfEmployees=numberOfEmployees;
        this.modelName=modelName;
        this.CEO=CEO;
        this.yearFounded=yearFounded;
        this.totalRevenue=totalRevenue;
        this.isPublic=isPublic;
        this.marketShare=marketShare;
    }

    public static void main(String[] args)
	{
        Lenovo model1 = new Lenovo(50,50000,"ThinkPad","Yuanqing Yang",1984,50000,true,20);
        System.out.println(model1.numberOfModels);
        System.out.println(model1.numberOfEmployees);
        System.out.println(model1.modelName);
        System.out.println(model1.CEO);
        System.out.println(model1.yearFounded);
        System.out.println(model1.totalRevenue);
        System.out.println(model1.isPublic);
        System.out.println(model1.marketShare);
        System.out.println(companyHQ);
        System.out.println(companyCountry);
        System.out.println(foundingYear);

        Lenovo model2 = new Lenovo(30, 45000, "IdeaPad", "Yuanqing Yang", 1984, 450000, true, 15);
        System.out.println(model2.numberOfModels);
        System.out.println(model2.numberOfEmployees);
        System.out.println(model2.modelName);
        System.out.println(model2.CEO);
        System.out.println(model2.yearFounded);
        System.out.println(model2.totalRevenue);
        System.out.println(model2.isPublic);
        System.out.println(model2.marketShare);
        System.out.println(companyHQ);
        System.out.println(companyCountry);
        System.out.println(foundingYear);
		
		Lenovo model3 = new Lenovo(40, 45550, "IdePad", "Yuanqing Yang 1", 1984, 45000, false, 15);
        System.out.println(model3.numberOfModels);
        System.out.println(model3.numberOfEmployees);
        System.out.println(model3.modelName);
        System.out.println(model3.CEO);
        System.out.println(model3.yearFounded);
        System.out.println(model3.totalRevenue);
        System.out.println(model3.isPublic);
        System.out.println(model3.marketShare);
        System.out.println(companyHQ);
        System.out.println(companyCountry);
        System.out.println(foundingYear);
    }
}
