// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class __pthread_cond_s {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("__wseq"),
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("__low"),
                Constants$root.C_INT$LAYOUT.withName("__high")
            ).withName("__wseq32")
        ).withName("$anon$0"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("__g1_start"),
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("__low"),
                Constants$root.C_INT$LAYOUT.withName("__high")
            ).withName("__g1_start32")
        ).withName("$anon$1"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_INT$LAYOUT).withName("__g_refs"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_INT$LAYOUT).withName("__g_size"),
        Constants$root.C_INT$LAYOUT.withName("__g1_orig_size"),
        Constants$root.C_INT$LAYOUT.withName("__wrefs"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_INT$LAYOUT).withName("__g_signals")
    ).withName("__pthread_cond_s");
    public static MemoryLayout $LAYOUT() {
        return __pthread_cond_s.$struct$LAYOUT;
    }
    static final VarHandle __wseq$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("__wseq"));
    public static VarHandle __wseq$VH() {
        return __pthread_cond_s.__wseq$VH;
    }
    public static long __wseq$get(MemorySegment seg) {
        return (long)__pthread_cond_s.__wseq$VH.get(seg);
    }
    public static void __wseq$set( MemorySegment seg, long x) {
        __pthread_cond_s.__wseq$VH.set(seg, x);
    }
    public static long __wseq$get(MemorySegment seg, long index) {
        return (long)__pthread_cond_s.__wseq$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __wseq$set(MemorySegment seg, long index, long x) {
        __pthread_cond_s.__wseq$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class __wseq32 {

        static final  GroupLayout __wseq32$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("__low"),
            Constants$root.C_INT$LAYOUT.withName("__high")
        );
        public static MemoryLayout $LAYOUT() {
            return __wseq32.__wseq32$struct$LAYOUT;
        }
        static final VarHandle __low$VH = __wseq32$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__low"));
        public static VarHandle __low$VH() {
            return __wseq32.__low$VH;
        }
        public static int __low$get(MemorySegment seg) {
            return (int)__wseq32.__low$VH.get(seg);
        }
        public static void __low$set( MemorySegment seg, int x) {
            __wseq32.__low$VH.set(seg, x);
        }
        public static int __low$get(MemorySegment seg, long index) {
            return (int)__wseq32.__low$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void __low$set(MemorySegment seg, long index, int x) {
            __wseq32.__low$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle __high$VH = __wseq32$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__high"));
        public static VarHandle __high$VH() {
            return __wseq32.__high$VH;
        }
        public static int __high$get(MemorySegment seg) {
            return (int)__wseq32.__high$VH.get(seg);
        }
        public static void __high$set( MemorySegment seg, int x) {
            __wseq32.__high$VH.set(seg, x);
        }
        public static int __high$get(MemorySegment seg, long index) {
            return (int)__wseq32.__high$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void __high$set(MemorySegment seg, long index, int x) {
            __wseq32.__high$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment __wseq32$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle __g1_start$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("__g1_start"));
    public static VarHandle __g1_start$VH() {
        return __pthread_cond_s.__g1_start$VH;
    }
    public static long __g1_start$get(MemorySegment seg) {
        return (long)__pthread_cond_s.__g1_start$VH.get(seg);
    }
    public static void __g1_start$set( MemorySegment seg, long x) {
        __pthread_cond_s.__g1_start$VH.set(seg, x);
    }
    public static long __g1_start$get(MemorySegment seg, long index) {
        return (long)__pthread_cond_s.__g1_start$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __g1_start$set(MemorySegment seg, long index, long x) {
        __pthread_cond_s.__g1_start$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class __g1_start32 {

        static final  GroupLayout __g1_start32$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("__low"),
            Constants$root.C_INT$LAYOUT.withName("__high")
        );
        public static MemoryLayout $LAYOUT() {
            return __g1_start32.__g1_start32$struct$LAYOUT;
        }
        static final VarHandle __low$VH = __g1_start32$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__low"));
        public static VarHandle __low$VH() {
            return __g1_start32.__low$VH;
        }
        public static int __low$get(MemorySegment seg) {
            return (int)__g1_start32.__low$VH.get(seg);
        }
        public static void __low$set( MemorySegment seg, int x) {
            __g1_start32.__low$VH.set(seg, x);
        }
        public static int __low$get(MemorySegment seg, long index) {
            return (int)__g1_start32.__low$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void __low$set(MemorySegment seg, long index, int x) {
            __g1_start32.__low$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle __high$VH = __g1_start32$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__high"));
        public static VarHandle __high$VH() {
            return __g1_start32.__high$VH;
        }
        public static int __high$get(MemorySegment seg) {
            return (int)__g1_start32.__high$VH.get(seg);
        }
        public static void __high$set( MemorySegment seg, int x) {
            __g1_start32.__high$VH.set(seg, x);
        }
        public static int __high$get(MemorySegment seg, long index) {
            return (int)__g1_start32.__high$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void __high$set(MemorySegment seg, long index, int x) {
            __g1_start32.__high$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment __g1_start32$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment __g_refs$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment __g_size$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    static final VarHandle __g1_orig_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__g1_orig_size"));
    public static VarHandle __g1_orig_size$VH() {
        return __pthread_cond_s.__g1_orig_size$VH;
    }
    public static int __g1_orig_size$get(MemorySegment seg) {
        return (int)__pthread_cond_s.__g1_orig_size$VH.get(seg);
    }
    public static void __g1_orig_size$set( MemorySegment seg, int x) {
        __pthread_cond_s.__g1_orig_size$VH.set(seg, x);
    }
    public static int __g1_orig_size$get(MemorySegment seg, long index) {
        return (int)__pthread_cond_s.__g1_orig_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __g1_orig_size$set(MemorySegment seg, long index, int x) {
        __pthread_cond_s.__g1_orig_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __wrefs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__wrefs"));
    public static VarHandle __wrefs$VH() {
        return __pthread_cond_s.__wrefs$VH;
    }
    public static int __wrefs$get(MemorySegment seg) {
        return (int)__pthread_cond_s.__wrefs$VH.get(seg);
    }
    public static void __wrefs$set( MemorySegment seg, int x) {
        __pthread_cond_s.__wrefs$VH.set(seg, x);
    }
    public static int __wrefs$get(MemorySegment seg, long index) {
        return (int)__pthread_cond_s.__wrefs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __wrefs$set(MemorySegment seg, long index, int x) {
        __pthread_cond_s.__wrefs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __g_signals$slice(MemorySegment seg) {
        return seg.asSlice(40, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


