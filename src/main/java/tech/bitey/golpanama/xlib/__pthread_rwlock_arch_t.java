// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct __pthread_rwlock_arch_t {
 *     unsigned int __readers;
 *     unsigned int __writers;
 *     unsigned int __wrphase_futex;
 *     unsigned int __writers_futex;
 *     unsigned int __pad3;
 *     unsigned int __pad4;
 *     int __cur_writer;
 *     int __shared;
 *     signed char __rwelision;
 *     unsigned char __pad1[7];
 *     unsigned long __pad2;
 *     unsigned int __flags;
 * };
 * }
 */
public class __pthread_rwlock_arch_t {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("__readers"),
        Constants$root.C_INT$LAYOUT.withName("__writers"),
        Constants$root.C_INT$LAYOUT.withName("__wrphase_futex"),
        Constants$root.C_INT$LAYOUT.withName("__writers_futex"),
        Constants$root.C_INT$LAYOUT.withName("__pad3"),
        Constants$root.C_INT$LAYOUT.withName("__pad4"),
        Constants$root.C_INT$LAYOUT.withName("__cur_writer"),
        Constants$root.C_INT$LAYOUT.withName("__shared"),
        Constants$root.C_CHAR$LAYOUT.withName("__rwelision"),
        MemoryLayout.sequenceLayout(7, Constants$root.C_CHAR$LAYOUT).withName("__pad1"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("__pad2"),
        Constants$root.C_INT$LAYOUT.withName("__flags"),
        MemoryLayout.paddingLayout(32)
    ).withName("__pthread_rwlock_arch_t");
    public static MemoryLayout $LAYOUT() {
        return __pthread_rwlock_arch_t.$struct$LAYOUT;
    }
    static final VarHandle __readers$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__readers"));
    public static VarHandle __readers$VH() {
        return __pthread_rwlock_arch_t.__readers$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int __readers;
     * }
     */
    public static int __readers$get(MemorySegment seg) {
        return (int)__pthread_rwlock_arch_t.__readers$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int __readers;
     * }
     */
    public static void __readers$set(MemorySegment seg, int x) {
        __pthread_rwlock_arch_t.__readers$VH.set(seg, x);
    }
    public static int __readers$get(MemorySegment seg, long index) {
        return (int)__pthread_rwlock_arch_t.__readers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __readers$set(MemorySegment seg, long index, int x) {
        __pthread_rwlock_arch_t.__readers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __writers$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__writers"));
    public static VarHandle __writers$VH() {
        return __pthread_rwlock_arch_t.__writers$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int __writers;
     * }
     */
    public static int __writers$get(MemorySegment seg) {
        return (int)__pthread_rwlock_arch_t.__writers$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int __writers;
     * }
     */
    public static void __writers$set(MemorySegment seg, int x) {
        __pthread_rwlock_arch_t.__writers$VH.set(seg, x);
    }
    public static int __writers$get(MemorySegment seg, long index) {
        return (int)__pthread_rwlock_arch_t.__writers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __writers$set(MemorySegment seg, long index, int x) {
        __pthread_rwlock_arch_t.__writers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __wrphase_futex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__wrphase_futex"));
    public static VarHandle __wrphase_futex$VH() {
        return __pthread_rwlock_arch_t.__wrphase_futex$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int __wrphase_futex;
     * }
     */
    public static int __wrphase_futex$get(MemorySegment seg) {
        return (int)__pthread_rwlock_arch_t.__wrphase_futex$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int __wrphase_futex;
     * }
     */
    public static void __wrphase_futex$set(MemorySegment seg, int x) {
        __pthread_rwlock_arch_t.__wrphase_futex$VH.set(seg, x);
    }
    public static int __wrphase_futex$get(MemorySegment seg, long index) {
        return (int)__pthread_rwlock_arch_t.__wrphase_futex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __wrphase_futex$set(MemorySegment seg, long index, int x) {
        __pthread_rwlock_arch_t.__wrphase_futex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __writers_futex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__writers_futex"));
    public static VarHandle __writers_futex$VH() {
        return __pthread_rwlock_arch_t.__writers_futex$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int __writers_futex;
     * }
     */
    public static int __writers_futex$get(MemorySegment seg) {
        return (int)__pthread_rwlock_arch_t.__writers_futex$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int __writers_futex;
     * }
     */
    public static void __writers_futex$set(MemorySegment seg, int x) {
        __pthread_rwlock_arch_t.__writers_futex$VH.set(seg, x);
    }
    public static int __writers_futex$get(MemorySegment seg, long index) {
        return (int)__pthread_rwlock_arch_t.__writers_futex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __writers_futex$set(MemorySegment seg, long index, int x) {
        __pthread_rwlock_arch_t.__writers_futex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __pad3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__pad3"));
    public static VarHandle __pad3$VH() {
        return __pthread_rwlock_arch_t.__pad3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int __pad3;
     * }
     */
    public static int __pad3$get(MemorySegment seg) {
        return (int)__pthread_rwlock_arch_t.__pad3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int __pad3;
     * }
     */
    public static void __pad3$set(MemorySegment seg, int x) {
        __pthread_rwlock_arch_t.__pad3$VH.set(seg, x);
    }
    public static int __pad3$get(MemorySegment seg, long index) {
        return (int)__pthread_rwlock_arch_t.__pad3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __pad3$set(MemorySegment seg, long index, int x) {
        __pthread_rwlock_arch_t.__pad3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __pad4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__pad4"));
    public static VarHandle __pad4$VH() {
        return __pthread_rwlock_arch_t.__pad4$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int __pad4;
     * }
     */
    public static int __pad4$get(MemorySegment seg) {
        return (int)__pthread_rwlock_arch_t.__pad4$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int __pad4;
     * }
     */
    public static void __pad4$set(MemorySegment seg, int x) {
        __pthread_rwlock_arch_t.__pad4$VH.set(seg, x);
    }
    public static int __pad4$get(MemorySegment seg, long index) {
        return (int)__pthread_rwlock_arch_t.__pad4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __pad4$set(MemorySegment seg, long index, int x) {
        __pthread_rwlock_arch_t.__pad4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __cur_writer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__cur_writer"));
    public static VarHandle __cur_writer$VH() {
        return __pthread_rwlock_arch_t.__cur_writer$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int __cur_writer;
     * }
     */
    public static int __cur_writer$get(MemorySegment seg) {
        return (int)__pthread_rwlock_arch_t.__cur_writer$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int __cur_writer;
     * }
     */
    public static void __cur_writer$set(MemorySegment seg, int x) {
        __pthread_rwlock_arch_t.__cur_writer$VH.set(seg, x);
    }
    public static int __cur_writer$get(MemorySegment seg, long index) {
        return (int)__pthread_rwlock_arch_t.__cur_writer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __cur_writer$set(MemorySegment seg, long index, int x) {
        __pthread_rwlock_arch_t.__cur_writer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __shared$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__shared"));
    public static VarHandle __shared$VH() {
        return __pthread_rwlock_arch_t.__shared$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int __shared;
     * }
     */
    public static int __shared$get(MemorySegment seg) {
        return (int)__pthread_rwlock_arch_t.__shared$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int __shared;
     * }
     */
    public static void __shared$set(MemorySegment seg, int x) {
        __pthread_rwlock_arch_t.__shared$VH.set(seg, x);
    }
    public static int __shared$get(MemorySegment seg, long index) {
        return (int)__pthread_rwlock_arch_t.__shared$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __shared$set(MemorySegment seg, long index, int x) {
        __pthread_rwlock_arch_t.__shared$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __rwelision$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__rwelision"));
    public static VarHandle __rwelision$VH() {
        return __pthread_rwlock_arch_t.__rwelision$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * signed char __rwelision;
     * }
     */
    public static byte __rwelision$get(MemorySegment seg) {
        return (byte)__pthread_rwlock_arch_t.__rwelision$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * signed char __rwelision;
     * }
     */
    public static void __rwelision$set(MemorySegment seg, byte x) {
        __pthread_rwlock_arch_t.__rwelision$VH.set(seg, x);
    }
    public static byte __rwelision$get(MemorySegment seg, long index) {
        return (byte)__pthread_rwlock_arch_t.__rwelision$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __rwelision$set(MemorySegment seg, long index, byte x) {
        __pthread_rwlock_arch_t.__rwelision$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __pad1$slice(MemorySegment seg) {
        return seg.asSlice(33, 7);
    }
    static final VarHandle __pad2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__pad2"));
    public static VarHandle __pad2$VH() {
        return __pthread_rwlock_arch_t.__pad2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long __pad2;
     * }
     */
    public static long __pad2$get(MemorySegment seg) {
        return (long)__pthread_rwlock_arch_t.__pad2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long __pad2;
     * }
     */
    public static void __pad2$set(MemorySegment seg, long x) {
        __pthread_rwlock_arch_t.__pad2$VH.set(seg, x);
    }
    public static long __pad2$get(MemorySegment seg, long index) {
        return (long)__pthread_rwlock_arch_t.__pad2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __pad2$set(MemorySegment seg, long index, long x) {
        __pthread_rwlock_arch_t.__pad2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__flags"));
    public static VarHandle __flags$VH() {
        return __pthread_rwlock_arch_t.__flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int __flags;
     * }
     */
    public static int __flags$get(MemorySegment seg) {
        return (int)__pthread_rwlock_arch_t.__flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int __flags;
     * }
     */
    public static void __flags$set(MemorySegment seg, int x) {
        __pthread_rwlock_arch_t.__flags$VH.set(seg, x);
    }
    public static int __flags$get(MemorySegment seg, long index) {
        return (int)__pthread_rwlock_arch_t.__flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __flags$set(MemorySegment seg, long index, int x) {
        __pthread_rwlock_arch_t.__flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


