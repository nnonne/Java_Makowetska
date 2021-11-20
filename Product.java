public class Product {
	String id;
	String Name;
	String UPC;
	int Year;
	int Month;
	int Day;
	String Manufacturer;
	int Price;
	int Amount;
	public Product(String id, String Name, String UPC, int Year, int Month, int Day,
		String Manufacturer, int Price,int Amount) {
		this.id = id;
		this.Name = Name;
		this.UPC = UPC;
		this.Year = Year;
		this.Month = Month;
		this.Day = Day;
		this.Manufacturer = Manufacturer;
		this.Price = Price;
		this.Amount = Amount;
		
	}
	public Product(String Name, String UPC,int Year, int Month, int Day, String Manufacturer ){
		this.id = "00000000";
		this.Name = Name;
		this.UPC = UPC;
		this.Year = Year;
		this.Month = Month;
		this.Day = Day;
		this.Manufacturer = Manufacturer;
		this.Price = 1;
		this.Amount = 0;
	}
	public Product() {
		
	}
	public String getName() {
		return Name;
	}
	public int getAmount() {
		return Amount;
	}
	public String getId() {
		return id;
	}
	public int[] getDate() {
		int[] arr = {Day, Month, Year};
		return arr;
	}
	public String getUPC() {
		return UPC;
	}
	public String getManufacturer() {
		return Manufacturer;
	}
	public int getPrice() {
		return Price;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setDate(int Day, int Month, int Year) {
		this.Day = Day;
		this.Month = Month;
		this.Year = Year;
	}
	public void setUPC(String UPC) {
		this.UPC = UPC;
	}
	public void setManufacturer(String Manufacturer) {
		this.Manufacturer = Manufacturer;
	}
	public void setPrice(int n) {
		this.Price = n;
	}
	public String toString() {
		String ans = "Product " + this.getName() + " with id " + this.getId() + " and UPC " + this.getUPC()+
				 " is prodused by " + this.getManufacturer()  
				 + " and cost " + this.getPrice() + "." ;
		return ans;
	}
	public static Product[] makeArray(int n,String[] names,String[] ids,String[] UPCs,
	   int[] years, int[] months, int[] days,String[] manufacturers, 
	   int[] prices,int[] amounts) {
        Product[] arr = new Product[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = new Product(ids[i],names[i], UPCs[i],years[i],months[i],days[i],
            		manufacturers[i], prices[i],amounts[i]);
        }
        return arr;
	}
	public static void main(String[] args) {
	   int n = 6;
	   String[] names = {"product1", "product2","product1","product4", "product2","product6"};
	   String[] ids = {"1","2","3","4","5","6"};
	   int[] years = {2020,2021,2021,2022,2020,2021};
	   int[] months = {1,2,3,4,5,6};
	   int[] days = {23,12,4,1,30,19};
	   String[] UPCs = {"UPC1","UPC2","UPC3","UPC4","UPC5","UPC6"};
	   String[] manufacturers = {"Manufacturer1","Manufacturer2","Manufacturer3","Manufacturer4","Manufacturer5","Manufacturer6"};
	   int[] prices = {300,100,250,150,200,250};
	   int[] amounts = {0,0,0,0,0,0};
	   Product[] arr = makeArray(n, names, ids, UPCs, years, months, days, manufacturers, 
			    prices,amounts);
	   System.out.println("task a");
	   
	   for (int i=0; i<arr.length; i++){
		   if (arr[i].getName() == "product1") {
			   System.out.println(arr[i].toString());
		   }
	   } 
	   System.out.println("task b");
	   
	   for (int i=0; i<arr.length; i++){
		   if (arr[i].getName() == "product1" && arr[i].getPrice() < 300) {
			   System.out.println(arr[i].toString());
		   }
	   }
	   System.out.println("task c");
	   
	   for (int i=0; i<arr.length; i++){
		   if (arr[i].getDate()[2] > 2021) {
			   System.out.println(arr[i].toString());
		   }
	   }
	}
}
