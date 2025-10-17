package com.korit.study.퀴즈;

import java.util.Objects;

public class GameConfigManager {
    public static GameConfigManager instance = new GameConfigManager(0, "");
    // TODO: 싱글톤 구현을 위한 필드들

    // 설정 정보 필드들
    private int soundVolume = 50;           // 기본값 50
    private String resolution = "1280x720"; // 기본 해상도

    // TODO: 생  성자 구현

    public GameConfigManager(int soundVolume, String resolution) {
        this.soundVolume = soundVolume;
        this.resolution = resolution;
    }

    // TODO: 싱글톤 인스턴스 반환 메서드 구현


    public static GameConfigManager getInstance() {
        if (Objects.isNull(instance)) {
            GameConfigManager instance = new GameConfigManager(0, "");
        }
        return instance;
    }

    // Getter/Setter 메서드들
    public void setSoundVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.soundVolume = volume;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public String getConfigInfo() {
        return String.format("Sound: %d, Resolution: %s",
                soundVolume, resolution);
    }
}
