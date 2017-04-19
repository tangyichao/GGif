package com.tang.ggif.beans;

import java.util.List;

/**
 * Created by tangyc on 2017/4/19.
 */

public class SearchTvs {


    /**
     * score : 17.970348
     * show : {"id":139,"url":"http://www.tvmaze.com/shows/139/girls","name":"Girls","type":"Scripted","language":"English","genres":["Drama","Romance"],"status":"Ended","runtime":30,"premiered":"2012-04-15","schedule":{"time":"22:00","days":["Sunday"]},"rating":{"average":6.6},"weight":99,"network":{"id":8,"name":"HBO","country":{"name":"United States","code":"US","timezone":"America/New_York"}},"webChannel":null,"externals":{"tvrage":30124,"thetvdb":220411,"imdb":"tt1723816"},"image":{"medium":"http://static.tvmaze.com/uploads/images/medium_portrait/31/78286.jpg","original":"http://static.tvmaze.com/uploads/images/original_untouched/31/78286.jpg"},"summary":"<p>This Emmy winning series is a comic look at the assorted humiliations and rare triumphs of a group of girls in their 20s.<\/p>","updated":1492431290,"_links":{"self":{"href":"http://api.tvmaze.com/shows/139"},"previousepisode":{"href":"http://api.tvmaze.com/episodes/1079686"}}}
     */

    private double score;
    private ShowBean show;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public ShowBean getShow() {
        return show;
    }

    public void setShow(ShowBean show) {
        this.show = show;
    }

    public static class ShowBean {
        /**
         * id : 139
         * url : http://www.tvmaze.com/shows/139/girls
         * name : Girls
         * type : Scripted
         * language : English
         * genres : ["Drama","Romance"]
         * status : Ended
         * runtime : 30
         * premiered : 2012-04-15
         * schedule : {"time":"22:00","days":["Sunday"]}
         * rating : {"average":6.6}
         * weight : 99
         * network : {"id":8,"name":"HBO","country":{"name":"United States","code":"US","timezone":"America/New_York"}}
         * webChannel : null
         * externals : {"tvrage":30124,"thetvdb":220411,"imdb":"tt1723816"}
         * image : {"medium":"http://static.tvmaze.com/uploads/images/medium_portrait/31/78286.jpg","original":"http://static.tvmaze.com/uploads/images/original_untouched/31/78286.jpg"}
         * summary : <p>This Emmy winning series is a comic look at the assorted humiliations and rare triumphs of a group of girls in their 20s.</p>
         * updated : 1492431290
         * _links : {"self":{"href":"http://api.tvmaze.com/shows/139"},"previousepisode":{"href":"http://api.tvmaze.com/episodes/1079686"}}
         */

        private int id;
        private String url;
        private String name;
        private String type;
        private String language;
        private String status;
        private int runtime;
        private String premiered;
        private ScheduleBean schedule;
        private RatingBean rating;
        private int weight;
        private NetworkBean network;
        private Object webChannel;
        private ExternalsBean externals;
        private ImageBean image;
        private String summary;
        private int updated;
        private LinksBean _links;
        private List<String> genres;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getRuntime() {
            return runtime;
        }

        public void setRuntime(int runtime) {
            this.runtime = runtime;
        }

        public String getPremiered() {
            return premiered;
        }

        public void setPremiered(String premiered) {
            this.premiered = premiered;
        }

        public ScheduleBean getSchedule() {
            return schedule;
        }

        public void setSchedule(ScheduleBean schedule) {
            this.schedule = schedule;
        }

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public NetworkBean getNetwork() {
            return network;
        }

        public void setNetwork(NetworkBean network) {
            this.network = network;
        }

        public Object getWebChannel() {
            return webChannel;
        }

        public void setWebChannel(Object webChannel) {
            this.webChannel = webChannel;
        }

        public ExternalsBean getExternals() {
            return externals;
        }

        public void setExternals(ExternalsBean externals) {
            this.externals = externals;
        }

        public ImageBean getImage() {
            return image;
        }

        public void setImage(ImageBean image) {
            this.image = image;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public int getUpdated() {
            return updated;
        }

        public void setUpdated(int updated) {
            this.updated = updated;
        }

        public LinksBean get_links() {
            return _links;
        }

        public void set_links(LinksBean _links) {
            this._links = _links;
        }

        public List<String> getGenres() {
            return genres;
        }

        public void setGenres(List<String> genres) {
            this.genres = genres;
        }

        public static class ScheduleBean {
            /**
             * time : 22:00
             * days : ["Sunday"]
             */

            private String time;
            private List<String> days;

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public List<String> getDays() {
                return days;
            }

            public void setDays(List<String> days) {
                this.days = days;
            }
        }

        public static class RatingBean {
            /**
             * average : 6.6
             */

            private double average;

            public double getAverage() {
                return average;
            }

            public void setAverage(double average) {
                this.average = average;
            }
        }

        public static class NetworkBean {
            /**
             * id : 8
             * name : HBO
             * country : {"name":"United States","code":"US","timezone":"America/New_York"}
             */

            private int id;
            private String name;
            private CountryBean country;

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

            public CountryBean getCountry() {
                return country;
            }

            public void setCountry(CountryBean country) {
                this.country = country;
            }

            public static class CountryBean {
                /**
                 * name : United States
                 * code : US
                 * timezone : America/New_York
                 */

                private String name;
                private String code;
                private String timezone;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getTimezone() {
                    return timezone;
                }

                public void setTimezone(String timezone) {
                    this.timezone = timezone;
                }
            }
        }

        public static class ExternalsBean {
            /**
             * tvrage : 30124
             * thetvdb : 220411
             * imdb : tt1723816
             */

            private int tvrage;
            private int thetvdb;
            private String imdb;

            public int getTvrage() {
                return tvrage;
            }

            public void setTvrage(int tvrage) {
                this.tvrage = tvrage;
            }

            public int getThetvdb() {
                return thetvdb;
            }

            public void setThetvdb(int thetvdb) {
                this.thetvdb = thetvdb;
            }

            public String getImdb() {
                return imdb;
            }

            public void setImdb(String imdb) {
                this.imdb = imdb;
            }
        }

        public static class ImageBean {
            /**
             * medium : http://static.tvmaze.com/uploads/images/medium_portrait/31/78286.jpg
             * original : http://static.tvmaze.com/uploads/images/original_untouched/31/78286.jpg
             */

            private String medium;
            private String original;

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }

            public String getOriginal() {
                return original;
            }

            public void setOriginal(String original) {
                this.original = original;
            }
        }

        public static class LinksBean {
            /**
             * self : {"href":"http://api.tvmaze.com/shows/139"}
             * previousepisode : {"href":"http://api.tvmaze.com/episodes/1079686"}
             */

            private SelfBean self;
            private PreviousepisodeBean previousepisode;

            public SelfBean getSelf() {
                return self;
            }

            public void setSelf(SelfBean self) {
                this.self = self;
            }

            public PreviousepisodeBean getPreviousepisode() {
                return previousepisode;
            }

            public void setPreviousepisode(PreviousepisodeBean previousepisode) {
                this.previousepisode = previousepisode;
            }

            public static class SelfBean {
                /**
                 * href : http://api.tvmaze.com/shows/139
                 */

                private String href;

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }
            }

            public static class PreviousepisodeBean {
                /**
                 * href : http://api.tvmaze.com/episodes/1079686
                 */

                private String href;

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }
            }
        }
    }
}
