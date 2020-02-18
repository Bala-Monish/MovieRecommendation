package com.example.Registration.Model;

import org.springframework.data.annotation.Id;

public class MovieGenre {
	
	
		@Id
	    private int id;
		private String genreName;

	    public int getId() { return id; }

	    public void setId(int id) {
	        this.id = id;
	    }

		public String getGenreName() {
			return genreName;
		}

		public void setGenreName(String genreName) {
			this.genreName = genreName;
		}
}
