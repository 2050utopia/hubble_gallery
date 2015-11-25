package com.derek_s.hubble_gallery.model;

/**
 * Created by dereksmith on 15-03-05.
 */
public class SectionObject {

    private String sectionTitle;
    private String query;
    private boolean isExpandable;

    /**
     * @return The sectionTitle
     */
    public String getSectionTitle() {
        return sectionTitle;
    }

    /**
     * @param sectionTitle The section_title
     */
    public void setSectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    /**
     * @return The query
     */
    public String getQuery() {
        return query;
    }

    /**
     * @param query The query
     */
    public void setQuery(String query) {
        this.query = query;
    }

    public void setExpandable(boolean expandable) {
        this.isExpandable = expandable;
    }

    public boolean getIsExpandable() {
        return isExpandable;
    }
}
