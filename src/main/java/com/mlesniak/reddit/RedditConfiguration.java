package com.mlesniak.reddit;

import com.mlesniak.runner.RunnerConfiguration;

/**
 * @author Michael Lesniak (mail@mlesniak.com)
 */
public class RedditConfiguration extends RunnerConfiguration {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public static RedditConfiguration get() {
        return (RedditConfiguration) RunnerConfiguration.get();
    }
}
