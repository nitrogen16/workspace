package phantomReference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

class PhantomInteger extends PhantomReference<Integer> {
	PhantomInteger(Integer referent, ReferenceQueue<? super Integer> queue) {
		super(referent, queue);
	}

	void close() {
		System.out.println("Bad Integer totally destroyed!");
	}
}
