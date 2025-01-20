package com.Nba.Nba_Zone.player;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_statistics")
public class Player {

    @Id
    @Column(name = "name", unique = true)
    private Integer player_id;
    private String name;
    private Integer games_played;
    private Integer minutes;
    private Integer field_goals_made;
    private Integer field_goals_attempted;
    private Double field_goals_percentage;
    private Integer three_pointers_made;
    private Integer three_pointers_attempted;
    private Double three_pointers_percentage;
    private Integer free_throws_made;
    private Integer free_throws_attempted;
    private Double free_throws_percentage;
    private Integer offensive_rebounds;
    private Integer defensive_rebounds;
    private Integer rebounds;
    private Integer assists;
    private Integer steals;
    private Integer blocks;
    private Integer turnovers;
    private Integer personal_fouls;
    private Integer points;
    private Double ast_tov;
    private Double stl_tov;
    private Double efg_pct;
    private Double ts_pct;
    private Integer games_played_rank;
    private Integer minutes_rank;
    private Integer field_goals_made_rank;
    private Integer field_goals_attempted_rank;
    private Integer three_points_made_rank;
    private Integer three_points_attempted_rank;
    private Integer three_points_percentage_rank;
    private Integer free_throws_made_rank;
    private Integer free_throws_attempted_rank;
    private Integer free_throws_percentage_rank;
    private Integer offensive_rebounds_rank;
    private Integer defensive_rebounds_rank;
    private Integer rebounds_rank;
    private Integer assists_rank;
    private Integer steals_rank;
    private Integer blocks_rank;
    private Integer turnover_rank;
    private Integer personal_fouls_rank;
    private Integer points_rank;
    private Integer ast_tov_rank;
    private Integer stl_tov_rank;
    private Integer efg_pct1;
    private Integer ts_pct1;


    public Player(Integer player_id, String name, Integer games_played, Integer minutes, Integer field_goals_made, Integer field_goals_attempted, Double field_goals_percentage, Integer three_pointers_made, Integer three_pointers_attempted, Double three_pointers_percentage, Integer free_throws_made, Integer free_throws_attempted, Double free_throws_percentage, Integer offensive_rebounds, Integer defensive_rebounds, Integer rebounds, Integer assists, Integer steals, Integer blocks, Integer turnovers, Integer personal_fouls, Integer points, Double ast_tov, Double stl_tov, Double efg_pct, Double ts_pct, Integer games_played_rank, Integer minutes_rank, Integer field_goals_made_rank, Integer field_goals_attempted_rank, Integer three_points_made_rank, Integer three_points_attempted_rank, Integer three_points_percentage_rank, Integer free_throws_made_rank, Integer free_throws_attempted_rank, Integer free_throws_percentage_rank, Integer offensive_rebounds_rank, Integer defensive_rebounds_rank, Integer rebounds_rank, Integer assists_rank, Integer steals_rank, Integer blocks_rank, Integer turnover_rank, Integer personal_fouls_rank, Integer points_rank, Integer ast_tov_rank, Integer stl_tov_rank, Integer efg_pct1, Integer ts_pct1) {
        this.player_id = player_id;
        this.name = name;
        this.games_played = games_played;
        this.minutes = minutes;
        this.field_goals_made = field_goals_made;
        this.field_goals_attempted = field_goals_attempted;
        this.field_goals_percentage = field_goals_percentage;
        this.three_pointers_made = three_pointers_made;
        this.three_pointers_attempted = three_pointers_attempted;
        this.three_pointers_percentage = three_pointers_percentage;
        this.free_throws_made = free_throws_made;
        this.free_throws_attempted = free_throws_attempted;
        this.free_throws_percentage = free_throws_percentage;
        this.offensive_rebounds = offensive_rebounds;
        this.defensive_rebounds = defensive_rebounds;
        this.rebounds = rebounds;
        this.assists = assists;
        this.steals = steals;
        this.blocks = blocks;
        this.turnovers = turnovers;
        this.personal_fouls = personal_fouls;
        this.points = points;
        this.ast_tov = ast_tov;
        this.stl_tov = stl_tov;
        this.efg_pct = efg_pct;
        this.ts_pct = ts_pct;
        this.games_played_rank = games_played_rank;
        this.minutes_rank = minutes_rank;
        this.field_goals_made_rank = field_goals_made_rank;
        this.field_goals_attempted_rank = field_goals_attempted_rank;
        this.three_points_made_rank = three_points_made_rank;
        this.three_points_attempted_rank = three_points_attempted_rank;
        this.three_points_percentage_rank = three_points_percentage_rank;
        this.free_throws_made_rank = free_throws_made_rank;
        this.free_throws_attempted_rank = free_throws_attempted_rank;
        this.free_throws_percentage_rank = free_throws_percentage_rank;
        this.offensive_rebounds_rank = offensive_rebounds_rank;
        this.defensive_rebounds_rank = defensive_rebounds_rank;
        this.rebounds_rank = rebounds_rank;
        this.assists_rank = assists_rank;
        this.steals_rank = steals_rank;
        this.blocks_rank = blocks_rank;
        this.turnover_rank = turnover_rank;
        this.personal_fouls_rank = personal_fouls_rank;
        this.points_rank = points_rank;
        this.ast_tov_rank = ast_tov_rank;
        this.stl_tov_rank = stl_tov_rank;
        this.efg_pct1 = efg_pct1;
        this.ts_pct1 = ts_pct1;
    }

    public Player(String name) {
        this.name = name;
    }

    public Integer getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(Integer player_id) {
        this.player_id = player_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGames_played() {
        return games_played;
    }

    public void setGames_played(Integer games_played) {
        this.games_played = games_played;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getField_goals_made() {
        return field_goals_made;
    }

    public void setField_goals_made(Integer field_goals_made) {
        this.field_goals_made = field_goals_made;
    }

    public Integer getField_goals_attempted() {
        return field_goals_attempted;
    }

    public void setField_goals_attempted(Integer field_goals_attempted) {
        this.field_goals_attempted = field_goals_attempted;
    }

    public Double getField_goals_percentage() {
        return field_goals_percentage;
    }

    public void setField_goals_percentage(Double field_goals_percentage) {
        this.field_goals_percentage = field_goals_percentage;
    }

    public Integer getThree_pointers_made() {
        return three_pointers_made;
    }

    public void setThree_pointers_made(Integer three_pointers_made) {
        this.three_pointers_made = three_pointers_made;
    }

    public Integer getThree_pointers_attempted() {
        return three_pointers_attempted;
    }

    public void setThree_pointers_attempted(Integer three_pointers_attempted) {
        this.three_pointers_attempted = three_pointers_attempted;
    }

    public Double getThree_pointers_percentage() {
        return three_pointers_percentage;
    }

    public void setThree_pointers_percentage(Double three_pointers_percentage) {
        this.three_pointers_percentage = three_pointers_percentage;
    }

    public Integer getFree_throws_made() {
        return free_throws_made;
    }

    public void setFree_throws_made(Integer free_throws_made) {
        this.free_throws_made = free_throws_made;
    }

    public Integer getFree_throws_attempted() {
        return free_throws_attempted;
    }

    public void setFree_throws_attempted(Integer free_throws_attempted) {
        this.free_throws_attempted = free_throws_attempted;
    }

    public Double getFree_throws_percentage() {
        return free_throws_percentage;
    }

    public void setFree_throws_percentage(Double free_throws_percentage) {
        this.free_throws_percentage = free_throws_percentage;
    }

    public Integer getOffensive_rebounds() {
        return offensive_rebounds;
    }

    public void setOffensive_rebounds(Integer offensive_rebounds) {
        this.offensive_rebounds = offensive_rebounds;
    }

    public Integer getDefensive_rebounds() {
        return defensive_rebounds;
    }

    public void setDefensive_rebounds(Integer defensive_rebounds) {
        this.defensive_rebounds = defensive_rebounds;
    }

    public Integer getRebounds() {
        return rebounds;
    }

    public void setRebounds(Integer rebounds) {
        this.rebounds = rebounds;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getSteals() {
        return steals;
    }

    public void setSteals(Integer steals) {
        this.steals = steals;
    }

    public Integer getBlocks() {
        return blocks;
    }

    public void setBlocks(Integer blocks) {
        this.blocks = blocks;
    }

    public Integer getTurnovers() {
        return turnovers;
    }

    public void setTurnovers(Integer turnovers) {
        this.turnovers = turnovers;
    }

    public Integer getPersonal_fouls() {
        return personal_fouls;
    }

    public void setPersonal_fouls(Integer personal_fouls) {
        this.personal_fouls = personal_fouls;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Double getAst_tov() {
        return ast_tov;
    }

    public void setAst_tov(Double ast_tov) {
        this.ast_tov = ast_tov;
    }

    public Double getStl_tov() {
        return stl_tov;
    }

    public void setStl_tov(Double stl_tov) {
        this.stl_tov = stl_tov;
    }

    public Double getEfg_pct() {
        return efg_pct;
    }

    public void setEfg_pct(Double efg_pct) {
        this.efg_pct = efg_pct;
    }

    public Double getTs_pct() {
        return ts_pct;
    }

    public void setTs_pct(Double ts_pct) {
        this.ts_pct = ts_pct;
    }

    public Integer getGames_played_rank() {
        return games_played_rank;
    }

    public void setGames_played_rank(Integer games_played_rank) {
        this.games_played_rank = games_played_rank;
    }

    public Integer getMinutes_rank() {
        return minutes_rank;
    }

    public void setMinutes_rank(Integer minutes_rank) {
        this.minutes_rank = minutes_rank;
    }

    public Integer getField_goals_made_rank() {
        return field_goals_made_rank;
    }

    public void setField_goals_made_rank(Integer field_goals_made_rank) {
        this.field_goals_made_rank = field_goals_made_rank;
    }

    public Integer getField_goals_attempted_rank() {
        return field_goals_attempted_rank;
    }

    public void setField_goals_attempted_rank(Integer field_goals_attempted_rank) {
        this.field_goals_attempted_rank = field_goals_attempted_rank;
    }

    public Integer getThree_points_made_rank() {
        return three_points_made_rank;
    }

    public void setThree_points_made_rank(Integer three_points_made_rank) {
        this.three_points_made_rank = three_points_made_rank;
    }

    public Integer getThree_points_attempted_rank() {
        return three_points_attempted_rank;
    }

    public void setThree_points_attempted_rank(Integer three_points_attempted_rank) {
        this.three_points_attempted_rank = three_points_attempted_rank;
    }

    public Integer getThree_points_percentage_rank() {
        return three_points_percentage_rank;
    }

    public void setThree_points_percentage_rank(Integer three_points_percentage_rank) {
        this.three_points_percentage_rank = three_points_percentage_rank;
    }

    public Integer getFree_throws_made_rank() {
        return free_throws_made_rank;
    }

    public void setFree_throws_made_rank(Integer free_throws_made_rank) {
        this.free_throws_made_rank = free_throws_made_rank;
    }

    public Integer getFree_throws_attempted_rank() {
        return free_throws_attempted_rank;
    }

    public void setFree_throws_attempted_rank(Integer free_throws_attempted_rank) {
        this.free_throws_attempted_rank = free_throws_attempted_rank;
    }

    public Integer getFree_throws_percentage_rank() {
        return free_throws_percentage_rank;
    }

    public void setFree_throws_percentage_rank(Integer free_throws_percentage_rank) {
        this.free_throws_percentage_rank = free_throws_percentage_rank;
    }

    public Integer getOffensive_rebounds_rank() {
        return offensive_rebounds_rank;
    }

    public void setOffensive_rebounds_rank(Integer offensive_rebounds_rank) {
        this.offensive_rebounds_rank = offensive_rebounds_rank;
    }

    public Integer getDefensive_rebounds_rank() {
        return defensive_rebounds_rank;
    }

    public void setDefensive_rebounds_rank(Integer defensive_rebounds_rank) {
        this.defensive_rebounds_rank = defensive_rebounds_rank;
    }

    public Integer getRebounds_rank() {
        return rebounds_rank;
    }

    public void setRebounds_rank(Integer rebounds_rank) {
        this.rebounds_rank = rebounds_rank;
    }

    public Integer getAssists_rank() {
        return assists_rank;
    }

    public void setAssists_rank(Integer assists_rank) {
        this.assists_rank = assists_rank;
    }

    public Integer getSteals_rank() {
        return steals_rank;
    }

    public void setSteals_rank(Integer steals_rank) {
        this.steals_rank = steals_rank;
    }

    public Integer getBlocks_rank() {
        return blocks_rank;
    }

    public void setBlocks_rank(Integer blocks_rank) {
        this.blocks_rank = blocks_rank;
    }

    public Integer getTurnover_rank() {
        return turnover_rank;
    }

    public void setTurnover_rank(Integer turnover_rank) {
        this.turnover_rank = turnover_rank;
    }

    public Integer getPersonal_fouls_rank() {
        return personal_fouls_rank;
    }

    public void setPersonal_fouls_rank(Integer personal_fouls_rank) {
        this.personal_fouls_rank = personal_fouls_rank;
    }

    public Integer getPoints_rank() {
        return points_rank;
    }

    public void setPoints_rank(Integer points_rank) {
        this.points_rank = points_rank;
    }

    public Integer getAst_tov_rank() {
        return ast_tov_rank;
    }

    public void setAst_tov_rank(Integer ast_tov_rank) {
        this.ast_tov_rank = ast_tov_rank;
    }

    public Integer getStl_tov_rank() {
        return stl_tov_rank;
    }

    public void setStl_tov_rank(Integer stl_tov_rank) {
        this.stl_tov_rank = stl_tov_rank;
    }

    public Integer getEfg_pct1() {
        return efg_pct1;
    }

    public void setEfg_pct1(Integer efg_pct1) {
        this.efg_pct1 = efg_pct1;
    }

    public Integer getTs_pct1() {
        return ts_pct1;
    }

    public void setTs_pct1(Integer ts_pct1) {
        this.ts_pct1 = ts_pct1;
    }
}
