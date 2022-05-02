package by.epam.classes.aggregation_and_composition.task3;

public class CountryView {

	int area = 0;

	public void printCapital(Country country) {
		
		System.out.println("Capital of " + country.getName() + ": " + country.getCapital());
		
	}

	public void printNumberOfRegions(Country country) {
		
		System.out.println("Number of regions: " + country.getRegions().size());
		
	}

	public void printAreaOfTheCountry(Country country) {

		for (Region region : country.getRegions())
			area += region.getSquare();

		System.out.println("Area of the country: " + area);

	}
	
	public void printRegionalCenters(Country country) {
		
		for (Region region : country.getRegions())
			System.out.println(region);
		
	}

}