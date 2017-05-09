package Java;

public class Garden {
	
	private int sugarCaneTrees,appleTrees,years;
	
//Constructor to set or initialize all the values 
	Garden(int sugarCaneTrees,int appleTrees,int years){
	
	if (sugarCaneTrees <= 0)
		this.sugarCaneTrees = 10;
	else 
	this.sugarCaneTrees = sugarCaneTrees;
	
	if (appleTrees <= 0)
		this.appleTrees = 10;
	else 
	this.appleTrees = appleTrees;
	
	if (years <= 0)
		this.years = 10;
	else 
	this.years = years;
	
	
/*		if (sugarCaneTrees <=0 || appleTrees <=0 || years<=0){
		this.sugarCaneTrees = 100;
		this.appleTrees = 100;
		this.years = 10;		
		}
		else
		{
		this.sugarCaneTrees = sugarCaneTrees;
		this.appleTrees = appleTrees;
		this.years = years;
		}*/
	}
	
	
	int TotalSales(){
		int SugarcaneTotalAmount = this.sugarCaneTrees * 100 * this.years;
		int AppletotalAmount = this.appleTrees * 200  * this.years;
		int TotalAmount = SugarcaneTotalAmount + AppletotalAmount;
		return (TotalAmount);
		//return (((this.sugarCaneTrees*100)+(this.appleTrees*100))*this.years);//100,200 is the sale amount per Sugar cane / apple tree
	}
	
	/*void printdetails(){
		
	int SugarcaneTotalAmount = this.sugarCaneTrees * 100 * this.years;
	int AppletotalAmount = this.appleTrees * 200  * this.years;
	int TotalAmount = SugarcaneTotalAmount + AppletotalAmount;
	System.out.println("Total Amount is = " + TotalAmount);
	
	}	*/	
	
	
		
	}

	
