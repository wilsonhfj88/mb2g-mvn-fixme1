package br.com.wilsongittest;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.kohsuke.github.GHBranch;
import org.kohsuke.github.GHContent;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        GitHub github = new GitHubBuilder().withOAuthToken("xxxx").build();
        
        GHRepository rep = github.getRepository("wilsonhfj88/javaclienttest");
        
        GHContent content = rep.getFileContent("spec/sample.yaml","develop");
        
        String text = IOUtils.toString(content.read(), StandardCharsets.UTF_8.name());
        
        System.out.println("YAML:" + text);
        
        
    }
}
