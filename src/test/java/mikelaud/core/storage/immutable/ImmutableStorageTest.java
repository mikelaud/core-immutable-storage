package mikelaud.core.storage.immutable;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class ImmutableStorageTest {

	private ImmutableStorage mImmutableStorage = null;
	
	@Before
	public void before() {
		mImmutableStorage = new ImmutableStorage();
	}
	
	@Test
	public void testConstructor() {
		assertNotNull(mImmutableStorage);
	}

}
