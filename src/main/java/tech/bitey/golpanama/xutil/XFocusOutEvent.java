// Generated by jextract

package tech.bitey.golpanama.xutil;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class XFocusOutEvent {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("serial"),
        Constants$root.C_INT$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("display"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("window"),
        Constants$root.C_INT$LAYOUT.withName("mode"),
        Constants$root.C_INT$LAYOUT.withName("detail")
    );
    public static MemoryLayout $LAYOUT() {
        return XFocusOutEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XFocusOutEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XFocusOutEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XFocusOutEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XFocusOutEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XFocusOutEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XFocusOutEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XFocusOutEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XFocusOutEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XFocusOutEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XFocusOutEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XFocusOutEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XFocusOutEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XFocusOutEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XFocusOutEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XFocusOutEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("display"));
    public static VarHandle display$VH() {
        return XFocusOutEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XFocusOutEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XFocusOutEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XFocusOutEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XFocusOutEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XFocusOutEvent.window$VH;
    }
    public static long window$get(MemorySegment seg) {
        return (long)XFocusOutEvent.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, long x) {
        XFocusOutEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XFocusOutEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XFocusOutEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mode"));
    public static VarHandle mode$VH() {
        return XFocusOutEvent.mode$VH;
    }
    public static int mode$get(MemorySegment seg) {
        return (int)XFocusOutEvent.mode$VH.get(seg);
    }
    public static void mode$set( MemorySegment seg, int x) {
        XFocusOutEvent.mode$VH.set(seg, x);
    }
    public static int mode$get(MemorySegment seg, long index) {
        return (int)XFocusOutEvent.mode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mode$set(MemorySegment seg, long index, int x) {
        XFocusOutEvent.mode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle detail$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("detail"));
    public static VarHandle detail$VH() {
        return XFocusOutEvent.detail$VH;
    }
    public static int detail$get(MemorySegment seg) {
        return (int)XFocusOutEvent.detail$VH.get(seg);
    }
    public static void detail$set( MemorySegment seg, int x) {
        XFocusOutEvent.detail$VH.set(seg, x);
    }
    public static int detail$get(MemorySegment seg, long index) {
        return (int)XFocusOutEvent.detail$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void detail$set(MemorySegment seg, long index, int x) {
        XFocusOutEvent.detail$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


