SELECT COUNT(TITLE), DIRECTOR FROM MOVIE
GROUP BY DIRECTOR;

SELECT COUNT(MOVIE_STAT.DOMESTIC_SALES), COUNT(MOVIE_STAT.INTERNATIONAL_SALES), MOVIE.DIRECTOR FROM MOVIE_STAT, MOVIE
WHERE MOVIE.ID = MOVIE_STAT.MOVIE_ID
GROUP BY MOVIE.DIRECTOR;
