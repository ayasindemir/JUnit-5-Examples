package org.ysn.test;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;

@IncludeTags("prod")
@SelectPackages("com.baeldung.tags")
public class TagAnnotationDemo {

}
