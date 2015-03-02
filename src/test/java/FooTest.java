import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class FooTest {

    @Test public void
    should_be_foo() {
        Foo foo = new Foo();
        assertThat(foo.foo(), is("foo"));
    }
    
    @Test public void
    mocking_things() {
        Bar bar = mock(Bar.class);
        bar.bar("bar");
        verify(bar).bar("bar");
    }
}
