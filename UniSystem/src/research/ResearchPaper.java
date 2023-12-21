package research;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ResearchPaper implements Comparable<ResearchPaper>{
    
		private String title;
	    private String authors;
	    private String journal;
	    private int pages;
	    private Date publicationDate;
	    private String doi;
	    private String citation;
	    private int citationCount;
    
    
	    public ResearchPaper(String title, String authors, String journal, int pages, Date publicationDate, String doi) {
	        this.title = title;
	        this.authors = authors;
	        this.journal = journal;
	        this.pages = pages;
	        this.publicationDate = publicationDate;
	        this.doi = doi;
	        this.citation = generateCitation();
	        this.citationCount = 1; // Start with 1 citation for the original publication
	    }
	   
	    
	 
	    public String getTitle() {
	        return title;
	    }

	    public String getAuthors() {
	        return authors;
	    }

	    public String getJournal() {
	        return journal;
	    }

	    public int getPages() {
	        return pages;
	    }

	    public Date getPublicationDate() {
	        return publicationDate;
	    }
	    
	    public String getDoi() {
	        return doi;
	    }
	    
	    public String getCitation() {
	        return citation;
	    }

	    private String generateCitation() {
	        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
	        String year = yearFormat.format(publicationDate);

	        return authors + ". (" + year + "). " + title + ". " + journal + ", " + pages + ".";
	    }

    
	    @Override
	    public int compareTo(ResearchPaper otherPaper) {
	        // Логика сравнения, например, по дате публикации
	        return this.publicationDate.compareTo(otherPaper.getPublicationDate());
	    }
    
    
	    public int getCitationCount() {
	        return citationCount;
	    }

	    public void incrementCitationCount() {
	        citationCount++;
	    }
}
