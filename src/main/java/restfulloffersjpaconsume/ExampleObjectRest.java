package restfulloffersjpaconsume;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class ExampleObjectRest  {
	private int id;
	private String name;
	private List<IncludeRest> restOb;
	
	public ExampleObjectRest () {

	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<IncludeRest> getRestOb() {
		return restOb;
	}

	public void setRestOb(List<IncludeRest> restOb) {
		this.restOb = restOb;
	}

	static  class IncludeRest {
		String data1;
		String data2;
		int count;
		public IncludeRest() {
			
		}
		public String getData1() {
			return data1;
		}
		public void setData1(String data1) {
			this.data1 = data1;
		}
		public String getData2() {
			return data2;
		}
		public void setData2(String data2) {
			this.data2 = data2;
		}
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		
		public String toString () {
			return data1+" "+data2+" "+count;
		}
		
	}
}


